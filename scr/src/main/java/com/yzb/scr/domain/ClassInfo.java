package com.yzb.scr.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName classinfo
 */
@Data
public class ClassInfo {
    private Integer classroomId;

    private String classroomLocation;

    private BigDecimal temperature;

    private BigDecimal humidity;

    private Integer airQuality;

    private Integer doorStatus;

    private Integer windowStatus;

    private Integer lightStatus;

    private Integer humidifierStatus;

    private Integer fanStatus;
}