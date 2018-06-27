package com.sparrow.job.api;


/**
 * @author harry
 */
public interface TaskService {
    /**
     * 任务执行成功
     *
     * @param taskId 任务id
     * @return
     */
    Boolean successTask(Long taskId);

    /**
     * 任务执行失败
     *
     * @param taskId 任务id
     * @param error  出错原因
     * @return
     */
    Boolean failTask(Long taskId, String error);
}
