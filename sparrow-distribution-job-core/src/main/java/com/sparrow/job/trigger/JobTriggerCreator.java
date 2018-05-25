package com.sparrow.job.trigger;

import com.sparrow.job.pojo.po.Task;
import com.sparrow.job.pojo.po.Trigger;

import java.util.List;

/**
 * created by harry on 2018/5/25.
 *
 * @author harry
 */
public interface JobTriggerCreator {
    Trigger createTrigger(Trigger previousTrigger);

    List<Task> createTask(Trigger trigger);

    List<Task> createChildTask(Trigger trigger, Task previousTask);
}
