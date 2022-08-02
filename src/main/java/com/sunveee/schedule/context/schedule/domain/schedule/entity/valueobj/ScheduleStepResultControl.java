package com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * ScheduleStepResultControl
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 23:52
 */
@Data
public class ScheduleStepResultControl implements Serializable {
    private static final long serialVersionUID = 6098674283355282641L;
    private String resultHandler;
    private Set<String/* orgCode */> resultHandleOrgCode;
}
