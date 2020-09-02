# Java笔记
学习一下 
- 类图
- 时序图
### 实用技巧记录
#### 排序
- 对象字段排序
    1. 对象实现 Comparable<GoodsDTO> 接口 
    2. 实现 compareTo() 方法,比较需要的字段
    3. Collections.sort(list, Comparator.comparing(GoodsDTO::getTotal));
#### 尽量采用懒加载的策略，即在需要的时候才创建


## 创建和销毁对象
#### 静态工厂方法替代构造器(空参有参)
#### 多个构造器可变参数考虑使用构建器(builder模式(注解@Builder))
    Student student = Student.builder().name("zs").age(24).build();


#### 使用lombok 
    @Setter
    @Getter
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")   
@Delegate
#### 创建集合以后可以使用静态构造方法
 - Maps.newHashMap();
 - Lists.newArrayList();
 
#### @Accessors(chain = true)  链式编程,创建对象后面可以一直set值
    Student student = new Student()
            .setAge(24)
            .setName("zs");

#### 数据库映射使用宝 entity

#### 校验参数 @Valid

#### 打日志的正确方式
#####     什么时候应该打日志
     1.当你遇到问题的时候，只能通过debug功能来确定问题，你应该考虑打日志，良好的系统，是可以通过日志进行问题定为的。
     2.当你碰到if…else 或者 switch这样的分支时，要在分支的首行打印日志，用来确定进入了哪个分支
     3.经常以功能为核心进行开发，你应该在提交代码前，可以确定通过日志可以看到整个流程       
    例子
    @Override
    @Transactional
    public void createUserAndBindMobile(@NotBlank String mobile, @NotNull User user) throws CreateConflictException{
        boolean debug = log.isDebugEnabled();
        if(debug){
            log.debug("开始创建用户并绑定手机号. args[mobile=[{}],user=[{}]]", mobile, LogObjects.toString(user));
        }
        try {
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            userRepository.insertSelective(user);
            if(debug){
                log.debug("创建用户信息成功. insertedUser=[{}]",LogObjects.toString(user));
            }
            UserMobileRelationship relationship = new UserMobileRelationship();
            relationship.setMobile(mobile);
            relationship.setOpenId(user.getOpenId());
            relationship.setCreateTime(new Date());
            relationship.setUpdateTime(new Date());
            userMobileRelationshipRepository.insertOnDuplicateKey(relationship);
            if(debug){
                log.debug("绑定手机成功. relationship=[{}]",LogObjects.toString(relationship));
            }
            log.info("创建用户并绑定手机号. userId=[{}],openId=[{}],mobile=[{}]",user.getId(),user.getOpenId(),mobile);
        }catch(DuplicateKeyException e){
            log.info("创建用户并绑定手机号失败,已存在相同的用户. openId=[{}],mobile=[{}]",user.getOpenId(),mobile);
            throw new CreateConflictException("创建用户发生冲突, openid=[%s]",user.getOpenId());
        }
    }

####  浅拷贝方法 
    使用org.springframework.beans.BeanUtils#copyProperties对代码进行重构和优化
        BeanUtils.copyProperties(userInputDTO,user);
    优化 User user = convertFor(userInputDTO);
     private User convertFor(UserInputDTO userInputDTO){
             User user = new User();
             BeanUtils.copyProperties(userInputDTO,user);
             return user;
     }
     在优化
     public interface DTOConvert<S,T> {
         T convert(S s);
     }
     虽然这个接口很简单，但是这里告诉我们一个事情，要去使用泛型，如果你是一个优秀的java程序员，请为你想做的抽象接口，做好泛型吧。
     我们再来看接口实现:
     public class UserInputDTOConvert implements DTOConvert {
         @Override
         public User convert(UserInputDTO userInputDTO) {
            User user = new User();
            BeanUtils.copyProperties(userInputDTO,user);
            return user;
         }
     }
     我们这样重构后，我们发现现在的代码是如此的简洁，并且那么的规范: 
     @RequestMapping("/v1/api/user")
     @RestController
     public class UserApi {
         @Autowired
         private UserService userService;
         @PostMapping
         public User addUser(UserInputDTO userInputDTO){
             User user = new UserInputDTOConvert().convert(userInputDTO);
             return userService.addUser(user);
         }
     }
    再继续优化
        public User convertToUser(){
            UserInputDTOConvert userInputDTOConvert = new UserInputDTOConvert();
            User convert = userInputDTOConvert.convert(this);
            return convert;
        }    
        private static class UserInputDTOConvert implements DTOConvert<UserInputDTO,User> {
            @Override
            public User convert(UserInputDTO userInputDTO) {
                User user = new User();
                BeanUtils.copyProperties(userInputDTO,user);
                return user;
            }
        }
        
    使用工具类继续优化
    private static class UserInputDTOConvert extends Converter<UserInputDTO, User> {
             @Override
             protected User doForward(UserInputDTO userInputDTO) {
                     User user = new User();
                     BeanUtils.copyProperties(userInputDTO,user);
                     return user;
             }
             @Override
             protected UserInputDTO doBackward(User user) {
                     UserInputDTO userInputDTO = new UserInputDTO();
                     BeanUtils.copyProperties(user,userInputDTO);
                     return userInputDTO;
             }
     }
     
     可以双向使用
         public User convertToUser(){
                 UserDTOConvert userDTOConvert = new UserDTOConvert();
                 User convert = userDTOConvert.convert(this);
                 return convert;
         }
         public UserDTO convertFor(User user){
                 UserDTOConvert userDTOConvert = new UserDTOConvert();
                 UserDTO convert = userDTOConvert.reverse().convert(user);
                 return convert;
         }  
         private static class UserDTOConvert extends Converter<UserDTO, User> {
                 @Override
                 protected User doForward(UserDTO userDTO) {
                         User user = new User();
                         BeanUtils.copyProperties(userDTO,user);
                         return user;
                 }
                 @Override
                 protected UserDTO doBackward(User user) {
                         UserDTO userDTO = new UserDTO();
                         BeanUtils.copyProperties(user,userDTO);
                         return userDTO;
                 }
         }
         可以使用断言,禁止反向调用
          @Override
          protected UserDTO doBackward(User user) {
                  throw new AssertionError("不支持逆向转化方法!");
          }
     
