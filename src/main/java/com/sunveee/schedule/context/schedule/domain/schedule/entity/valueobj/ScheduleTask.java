package com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj;

import lombok.Data;

import java.io.Serializable;

/**
 * ScheduleTask
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 23:26
 */
@Data
public class ScheduleTask implements Serializable {
    private static final long serialVersionUID = -1216249064341573739L;
    private String taskCode;
    private String taskName;
    private ScheduleTaskProject project;
}
