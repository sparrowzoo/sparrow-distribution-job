package com.sparrow.job.dao;

import com.sparrow.job.pojo.po.Job;

import java.util.List;

/**
 * @author harry
 * @date 2018/5/25
 */
public interface JobDAO {
    /**
     * 获取所有可自动创建的job 列表
     */
    List<Job> getAllowAutoCreatableJobList();
}
