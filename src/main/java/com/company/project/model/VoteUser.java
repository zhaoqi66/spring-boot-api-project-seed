package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vote_user")
public class VoteUser {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 活动结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 免费票数
     */
    @Column(name = "free_tickets")
    private Integer freeTickets;

    /**
     * 投票人员
     */
    private String openid;

    /**
     * 登陆时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 充值票数
     */
    private Integer tickets;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取免费票数
     *
     * @return free_tickets - 免费票数
     */
    public Integer getFreeTickets() {
        return freeTickets;
    }

    /**
     * 设置免费票数
     *
     * @param freeTickets 免费票数
     */
    public void setFreeTickets(Integer freeTickets) {
        this.freeTickets = freeTickets;
    }

    /**
     * 获取投票人员
     *
     * @return openid - 投票人员
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置投票人员
     *
     * @param openid 投票人员
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取登陆时间
     *
     * @return start_time - 登陆时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置登陆时间
     *
     * @param startTime 登陆时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取充值票数
     *
     * @return tickets - 充值票数
     */
    public Integer getTickets() {
        return tickets;
    }

    /**
     * 设置充值票数
     *
     * @param tickets 充值票数
     */
    public void setTickets(Integer tickets) {
        this.tickets = tickets;
    }
}