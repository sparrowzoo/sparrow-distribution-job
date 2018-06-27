package com.sparrow.job.po;

/**
 * @author harry
 */
public class Trigger {

    public static Trigger newTrigger(Integer triggerId, Integer jobId, Integer previousTrigger) {
        Trigger trigger = new Trigger();
        trigger.triggerId = triggerId;
        trigger.jobId = jobId;
        trigger.previousTrigger = previousTrigger;
        return trigger;
    }

    private Integer triggerId;
    private Integer jobId;
    /**
     * 0 未执行  1 执行中 2 已完成
     */
    private Integer status;
    private Integer isError;
    private Integer previousTrigger;
    private Long fireTime;
    private Long startTime;
    private Long endTime;
    private Long createTime;
    private Long executeTime;

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsError() {
        return isError;
    }

    public void setIsError(Integer isError) {
        this.isError = isError;
    }

    public Integer getPreviousTrigger() {
        return previousTrigger;
    }

    public void setPreviousTrigger(Integer previousTrigger) {
        this.previousTrigger = previousTrigger;
    }

    public Long getFireTime() {
        return fireTime;
    }

    public void setFireTime(Long fireTime) {
        this.fireTime = fireTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }
}
