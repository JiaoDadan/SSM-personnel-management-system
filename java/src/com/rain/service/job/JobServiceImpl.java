package com.rain.service.job;

import com.rain.dao.JobDao;
import com.rain.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("jobService")
public class JobServiceImpl implements IJobService {

    @Autowired
    JobDao jobDao;

    /**
     * 职位管理的操作
     */
    @Override
    public List<Job> findAllJob() {
        // TODO Auto-generated method stub
        return jobDao.get_List();
    }

    @Override
    public List<Job> findAllJob(String content) {
        // TODO Auto-generated method stub
        return jobDao.get_LikeList(content);
    }

    @Override
    public Job get_JobInfo(Integer id) {
        // TODO Auto-generated method stub
        return jobDao.get_Info(id);
    }

    @Override
    public void update_JobInfo(Job job) {
        // TODO Auto-generated method stub
        jobDao.update_Info(job);
    }

    @Override
    public void insert_JobInfo(Job job) {
        // TODO Auto-generated method stub
        jobDao.insert_Info(job);
    }

    @Override
    public void delete_JobInfo(Integer id) {
        // TODO Auto-generated method stub
        jobDao.delete_Info(id);
    }
}
