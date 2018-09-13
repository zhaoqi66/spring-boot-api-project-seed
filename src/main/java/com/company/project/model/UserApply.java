package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_apply")
public class UserApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 活动id
     */
    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 报名参加活动时间
     */
    @Column(name = "apply_time")
    private Date applyTime;

    /**
     * 个人介绍
     */
    private String description;

    /**
     * 性别 0-女 1-男
     */
    private String gerder;

    /**
     * 活动参与者姓名
     */
    private String name;

    /**
     * 注册用户id
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 报名电话
     */
    private String phone;

    /**
     * 照片
     */
    private String pic;

    /**
     * 审核原因
     */
    private String reason;

    /**
     * 管理者审核时间
     */
    @Column(name = "review_time")
    private Date reviewTime;

    /**
     * 报名状态0-已报名 1-取消报名 2-报名成功(审核通过) 3-审核不通过
     */
    private String status;

    /**
     * 总票数
     */
    @Column(name = "total_votes")
    private Long totalVotes;

    /**
     * 修改报名信息时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取活动id
     *
     * @return activity_id - 活动id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 设置活动id
     *
     * @param activityId 活动id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取报名参加活动时间
     *
     * @return apply_time - 报名参加活动时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 设置报名参加活动时间
     *
     * @param applyTime 报名参加活动时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 获取个人介绍
     *
     * @return description - 个人介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置个人介绍
     *
     * @param description 个人介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取性别 0-女 1-男
     *
     * @return gerder - 性别 0-女 1-男
     */
    public String getGerder() {
        return gerder;
    }

    /**
     * 设置性别 0-女 1-男
     *
     * @param gerder 性别 0-女 1-男
     */
    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    /**
     * 获取活动参与者姓名
     *
     * @return name - 活动参与者姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动参与者姓名
     *
     * @param name 活动参与者姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取注册用户id
     *
     * @return open_id - 注册用户id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置注册用户id
     *
     * @param openId 注册用户id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取报名电话
     *
     * @return phone - 报名电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置报名电话
     *
     * @param phone 报名电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取照片
     *
     * @return pic - 照片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置照片
     *
     * @param pic 照片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取审核原因
     *
     * @return reason - 审核原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置审核原因
     *
     * @param reason 审核原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取管理者审核时间
     *
     * @return review_time - 管理者审核时间
     */
    public Date getReviewTime() {
        return reviewTime;
    }

    /**
     * 设置管理者审核时间
     *
     * @param reviewTime 管理者审核时间
     */
    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    /**
     * 获取报名状态0-已报名 1-取消报名 2-报名成功(审核通过) 3-审核不通过
     *
     * @return status - 报名状态0-已报名 1-取消报名 2-报名成功(审核通过) 3-审核不通过
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置报名状态0-已报名 1-取消报名 2-报名成功(审核通过) 3-审核不通过
     *
     * @param status 报名状态0-已报名 1-取消报名 2-报名成功(审核通过) 3-审核不通过
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取总票数
     *
     * @return total_votes - 总票数
     */
    public Long getTotalVotes() {
        return totalVotes;
    }

    /**
     * 设置总票数
     *
     * @param totalVotes 总票数
     */
    public void setTotalVotes(Long totalVotes) {
        this.totalVotes = totalVotes;
    }

    /**
     * 获取修改报名信息时间
     *
     * @return update_time - 修改报名信息时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改报名信息时间
     *
     * @param updateTime 修改报名信息时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}