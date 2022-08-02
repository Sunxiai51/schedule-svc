package com.sunveee.schedule.context.schedule.domain.schedule.entity;

import com.sunveee.schedule.context.schedule.domain.org.entity.ScheduleOrg;
import com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj.ScheduleStep;
import com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj.ScheduleTask;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ScheduleContext
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 22:51
 */
@Data
public class ScheduleContext implements Serializable {
    private static final long serialVersionUID = -6508550881668462819L;
    private long id;
    private String code;
    private String type;
    private ScheduleOrg createOrg;
    private ScheduleOrg leaderOrg;
    private List<ScheduleOrg> followerOrg;
    private long createTimestamp;
    private ScheduleTask task;
    private List<ScheduleStep> steps;

}
