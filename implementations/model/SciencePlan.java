package com.example.gemini13.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SciencePlan {

    @Id
    @GeneratedValue
    private Long id;

    private String planName;
    private String target;
    private String observationTime;
    private String instrumentConfig;

    // 省略构造函数

    public SciencePlan() {}

    public SciencePlan(String planName, String target, String observationTime, String instrumentConfig) {
        this.planName = planName;
        this.target = target;
        this.observationTime = observationTime;
        this.instrumentConfig = instrumentConfig;
    }

    // getter & setter

    public Long getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getInstrumentConfig() {
        return instrumentConfig;
    }

    public void setInstrumentConfig(String instrumentConfig) {
        this.instrumentConfig = instrumentConfig;
    }
}
