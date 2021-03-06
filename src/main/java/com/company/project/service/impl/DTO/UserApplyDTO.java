package com.company.project.service.impl.DTO;

import com.company.project.model.UserApply;
import lombok.Data;

import java.util.Date;

@Data
public class UserApplyDTO {
    /**
     * 活动报名表主键
     */
    private int id;
    /**
     * 活动参与者姓名
     */
    private String name;
    /**
     * 报名参加活动时间
     */
    private Date applyTime;
    /**
     * 性别 0-女 1-男
     */
    private String gerder;
    /**
     * 报名电话
     */
    private String phone;
    /**
     * 个人介绍
     */
    private String description;
    /**
     * 照片
     */
    private String[] pic;
    /**
     * 活动id
     */
    private Integer activityId;
    /**
     * 注册用户id
     */
    private String openId;
    /**
     * 报名状态
     */
    private String status;

    /**
     * 总票数
     */
    private Long totalVotes;

    public UserApplyDTO() {
    }

    public UserApplyDTO(UserApply userApply, String[] pic) {
        this.id = userApply.getId();
        this.name = userApply.getName();
        this.applyTime = userApply.getApplyTime();
        this.gerder = userApply.getGerder();
        this.phone = userApply.getPhone();
        this.description = userApply.getDescription();
        this.pic = pic;
        this.activityId = userApply.getActivityId();
        this.openId = userApply.getOpenId();
        this.status = userApply.getStatus();
        this.totalVotes = userApply.getTotalVotes();
    }
}
