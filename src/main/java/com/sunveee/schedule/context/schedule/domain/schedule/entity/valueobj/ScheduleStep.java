package com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj;

import lombok.Data;

import java.io.Serializable;

/**
 * ScheduleStep
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 23:01
 */
@Data
public class ScheduleStep implements Serializable {
    private static final long serialVersionUID = -6720006912599464689L;
    private String code;
    private int order;
    private ScheduleStepExecuteControl executeControl;
    private ScheduleStepResultControl resultControl;
}
