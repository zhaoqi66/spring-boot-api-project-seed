package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_activity")
public class SysActivity {
    @Id
    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 活动名称
     */
    @Column(name = "activity_name")
    private String activityName;

    /**
     * 活动报名人数
     */
    @Column(name = "activity_take_count")
    private Integer activityTakeCount;

    /**
     * 活动创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 删除标记(0删除1正常)
     */
    @Column(name = "delete_flag")
    private Byte deleteFlag;

    /**
     * 活动结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 活动修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 活动规则
     */
    private String pic;

    /**
     * 活动开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 活动状态(0报名中1已结束2活动中)
     */
    @Column(name = "activity_status")
    private Byte activityStatus;

    /**
     * 第一档金额
     */
    @Column(name = "first_money")
    private Double firstMoney;

    /**
     * 第一档人气
     */
    @Column(name = "first_ratio")
    private Integer firstRatio;

    /**
     * 第二档金额
     */
    @Column(name = "second_money")
    private Double secondMoney;

    /**
     * 第二档人气
     */
    @Column(name = "second_ratio")
    private Integer secondRatio;

    /**
     * 第三档金额
     */
    @Column(name = "third_money")
    private Double thirdMoney;

    /**
     * 第三档人气
     */
    @Column(name = "third_ratio")
    private Integer thirdRatio;

    /**
     * @return activity_id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取活动名称
     *
     * @return activity_name - 活动名称
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置活动名称
     *
     * @param activityName 活动名称
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * 获取活动报名人数
     *
     * @return activity_take_count - 活动报名人数
     */
    public Integer getActivityTakeCount() {
        return activityTakeCount;
    }

    /**
     * 设置活动报名人数
     *
     * @param activityTakeCount 活动报名人数
     */
    public void setActivityTakeCount(Integer activityTakeCount) {
        this.activityTakeCount = activityTakeCount;
    }

    /**
     * 获取活动创建时间
     *
     * @return create_time - 活动创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置活动创建时间
     *
     * @param createTime 活动创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取删除标记(0删除1正常)
     *
     * @return delete_flag - 删除标记(0删除1正常)
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标记(0删除1正常)
     *
     * @param deleteFlag 删除标记(0删除1正常)
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取活动结束时间
     *
     * @return end_time - 活动结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置活动结束时间
     *
     * @param endTime 活动结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取活动修改时间
     *
     * @return modified_time - 活动修改时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置活动修改时间
     *
     * @param modifiedTime 活动修改时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * 获取活动规则
     *
     * @return pic - 活动规则
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置活动规则
     *
     * @param pic 活动规则
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取活动开始时间
     *
     * @return start_time - 活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置活动开始时间
     *
     * @param startTime 活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取活动状态(0报名中1已结束2活动中)
     *
     * @return activity_status - 活动状态(0报名中1已结束2活动中)
     */
    public Byte getActivityStatus() {
        return activityStatus;
    }

    /**
     * 设置活动状态(0报名中1已结束2活动中)
     *
     * @param activityStatus 活动状态(0报名中1已结束2活动中)
     */
    public void setActivityStatus(Byte activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * 获取第一档金额
     *
     * @return first_money - 第一档金额
     */
    public Double getFirstMoney() {
        return firstMoney;
    }

    /**
     * 设置第一档金额
     *
     * @param firstMoney 第一档金额
     */
    public void setFirstMoney(Double firstMoney) {
        this.firstMoney = firstMoney;
    }

    /**
     * 获取第一档人气
     *
     * @return first_ratio - 第一档人气
     */
    public Integer getFirstRatio() {
        return firstRatio;
    }

    /**
     * 设置第一档人气
     *
     * @param firstRatio 第一档人气
     */
    public void setFirstRatio(Integer firstRatio) {
        this.firstRatio = firstRatio;
    }

    /**
     * 获取第二档金额
     *
     * @return second_money - 第二档金额
     */
    public Double getSecondMoney() {
        return secondMoney;
    }

    /**
     * 设置第二档金额
     *
     * @param secondMoney 第二档金额
     */
    public void setSecondMoney(Double secondMoney) {
        this.secondMoney = secondMoney;
    }

    /**
     * 获取第二档人气
     *
     * @return second_ratio - 第二档人气
     */
    public Integer getSecondRatio() {
        return secondRatio;
    }

    /**
     * 设置第二档人气
     *
     * @param secondRatio 第二档人气
     */
    public void setSecondRatio(Integer secondRatio) {
        this.secondRatio = secondRatio;
    }

    /**
     * 获取第三档金额
     *
     * @return third_money - 第三档金额
     */
    public Double getThirdMoney() {
        return thirdMoney;
    }

    /**
     * 设置第三档金额
     *
     * @param thirdMoney 第三档金额
     */
    public void setThirdMoney(Double thirdMoney) {
        this.thirdMoney = thirdMoney;
    }

    /**
     * 获取第三档人气
     *
     * @return third_ratio - 第三档人气
     */
    public Integer getThirdRatio() {
        return thirdRatio;
    }

    /**
     * 设置第三档人气
     *
     * @param thirdRatio 第三档人气
     */
    public void setThirdRatio(Integer thirdRatio) {
        this.thirdRatio = thirdRatio;
    }
}