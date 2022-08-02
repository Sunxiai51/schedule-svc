package com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj;

import lombok.Data;

import java.io.Serializable;

/**
 * ScheduleTaskProject
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 23:37
 */
@Data
public class ScheduleTaskProject implements Serializable {
    private static final long serialVersionUID = 4313536301663159269L;

    private String projectCode;
    private String projectName;
}
