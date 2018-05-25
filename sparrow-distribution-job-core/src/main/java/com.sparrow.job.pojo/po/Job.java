package com.sparrow.job.pojo.po;

import com.sparrow.enums.STATUS_RECORD;

/**
 * created by harry on 2018/5/25.
 * @author harry
 */
public class Job {

    public static Job newJob(Integer jobId, String jobName, String cron, String description, Long effectTime, Long disableTime, Integer createUserId, Integer allowNext, String taskHandler) {
        Job job = new Job();
        job.jobId = jobId;
        job.jobName = jobName;
        job.cron = cron;
        job.description = description;
        job.effectTime = effectTime;
        job.disableTime = disableTime;
        job.createUserId = createUserId;
        job.updateUserId = createUserId;
        job.createTime = System.currentTimeMillis();
        job.updateTime = job.createTime;
        job.allowNext = allowNext;
        job.taskHandler = taskHandler;
        job.status = STATUS_RECORD.ENABLE.ordinal();
        return job;
    }

    private Integer jobId;
    private String jobName;
    private String cron;
    private String description;
    private Integer status;
    private Long effectTime;
    private Long disableTime;
    private Long createTime;
    private Long updateTime;
    private Integer createUserId;
    private Integer updateUserId;
    /**
     * 下个trigger 的触发时间
     */
    private Long nextTriggerTime;
    private Long lastTriggerTime;
    /**
     * 是否可以通过creator自动创建trigger
     * 有些 schedule 是需要运行时，动态确定任务 即下一个trigger或者任务需要依赖上一个任务的结果
     */
    private Integer allowNext;
    private String taskHandler;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
    }

    public Long getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Long disableTime) {
        this.disableTime = disableTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getLastTriggerTime() {
        return lastTriggerTime;
    }

    public void setLastTriggerTime(Long lastTriggerTime) {
        this.lastTriggerTime = lastTriggerTime;
    }

    public Integer getAllowNext() {
        return allowNext;
    }

    public void setAllowNext(Integer allowNext) {
        this.allowNext = allowNext;
    }

    public String getTaskHandler() {
        return taskHandler;
    }

    public void setTaskHandler(String taskHandler) {
        this.taskHandler = taskHandler;
    }
}
