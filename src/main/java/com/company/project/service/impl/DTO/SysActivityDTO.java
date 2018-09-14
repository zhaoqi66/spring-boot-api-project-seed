package com.company.project.service.impl.DTO;

import com.company.project.model.SysActivity;
import lombok.Data;

import java.util.Date;

/**
 * @author FHZD.xiaoxun
 * @date 2018/9/14
 */
@Data
public class SysActivityDTO {

    private Integer activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动报名人数
     */
    private Integer activityTakeCount;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 活动规则
     */
    private String[] pic;

    public SysActivityDTO() {
    }

    public SysActivityDTO(SysActivity sysActivity, String[] pic) {
        this.activityId = sysActivity.getActivityId();
        this.activityName = sysActivity.getActivityName();
        this.activityTakeCount = sysActivity.getActivityTakeCount();
        this.startTime = sysActivity.getStartTime();
        this.endTime = sysActivity.getEndTime();
        this.pic = pic;
    }
}
