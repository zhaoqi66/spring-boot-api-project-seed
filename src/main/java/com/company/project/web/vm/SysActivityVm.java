package com.company.project.web.vm;

import java.util.Date;

/**
 * @author FHZD.xiaoxun
 * @date 2018/9/13
 */
public class SysActivityVm {

    private Integer activityId;

    private String activityName;

    private Integer activityTakeCount;

    private Date createTime;

    private Byte deleteFlag;

    private Date endTime;

    private Date modifiedTime;

    private String[] pic;

    private Date startTime;

    private Byte activityStatus;

    private Double firstMoney;

    private Integer firstRatio;

    private Double secondMoney;

    private Integer secondRatio;

    private Double thirdMoney;

    private Integer thirdRatio;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityTakeCount() {
        return activityTakeCount;
    }

    public void setActivityTakeCount(Integer activityTakeCount) {
        this.activityTakeCount = activityTakeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String[] getPic() {
        return pic;
    }

    public void setPic(String[] pic) {
        this.pic = pic;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Byte getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Byte activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Double getFirstMoney() {
        return firstMoney;
    }

    public void setFirstMoney(Double firstMoney) {
        this.firstMoney = firstMoney;
    }

    public Integer getFirstRatio() {
        return firstRatio;
    }

    public void setFirstRatio(Integer firstRatio) {
        this.firstRatio = firstRatio;
    }

    public Double getSecondMoney() {
        return secondMoney;
    }

    public void setSecondMoney(Double secondMoney) {
        this.secondMoney = secondMoney;
    }

    public Integer getSecondRatio() {
        return secondRatio;
    }

    public void setSecondRatio(Integer secondRatio) {
        this.secondRatio = secondRatio;
    }

    public Double getThirdMoney() {
        return thirdMoney;
    }

    public void setThirdMoney(Double thirdMoney) {
        this.thirdMoney = thirdMoney;
    }

    public Integer getThirdRatio() {
        return thirdRatio;
    }

    public void setThirdRatio(Integer thirdRatio) {
        this.thirdRatio = thirdRatio;
    }
}
