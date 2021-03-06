package com.company.project.web.vm;

import java.util.Arrays;
import java.util.Date;

/**
 * @author FHZD.xiaoxun
 * @date 2018/9/14
 */
public class SysActivityVm {
    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 活动规则
     */
    private String[] pic;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 第一档金额
     */
    private Double firstMoney;

    /**
     * 第一档人气
     */
    private Integer firstRatio;

    /**
     * 第二档金额
     */
    private Double secondMoney;

    /**
     * 第二档人气
     */
    private Integer secondRatio;

    /**
     * 第三档金额
     */
    private Double thirdMoney;

    /**
     * 第三档人气
     */
    private Integer thirdRatio;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    @Override
    public String toString() {
        return "SysActivityVm{" +
                "activityName='" + activityName + '\'' +
                ", endTime=" + endTime +
                ", pic=" + Arrays.toString(pic) +
                ", startTime=" + startTime +
                ", firstMoney=" + firstMoney +
                ", firstRatio=" + firstRatio +
                ", secondMoney=" + secondMoney +
                ", secondRatio=" + secondRatio +
                ", thirdMoney=" + thirdMoney +
                ", thirdRatio=" + thirdRatio +
                '}';
    }
}
