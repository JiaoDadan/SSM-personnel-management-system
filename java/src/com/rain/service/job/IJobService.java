package com.rain.service.job;

import com.rain.domain.Job;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface IJobService {
    /**
     * 职位信息的service
     *
     * @return
     */

    List<Job> findAllJob();

    List<Job> findAllJob(String content);

    Job get_JobInfo(Integer id);

    void update_JobInfo(Job job);

    void insert_JobInfo(Job job);

    void delete_JobInfo(Integer id);
}
