package com.sunveee.schedule.context.schedule.domain.schedule.entity.valueobj;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * ScheduleStepExecuteControl
 *
 * @Author: Wu Yiyang
 * @Date: 2022/8/2 23:43
 */
@Data
public class ScheduleStepExecuteControl implements Serializable {
    private static final long serialVersionUID = 5765928688649406661L;
    private String executor;
    private Set<String/* orgCode */> consumeOrgCode;
    private String param;
    // 预期执行时间
    private long predictSpendMills;
    // 超时时间
    private long timeoutMills;
}
