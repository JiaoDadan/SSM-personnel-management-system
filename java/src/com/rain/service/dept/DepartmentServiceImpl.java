package com.rain.service.dept;

import com.rain.dao.DeptDao;
import com.rain.domain.Dept;
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
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {


    @Autowired
    DeptDao deptDao;

    /**
     * 部门信息的管理
     */
    @Transactional(readOnly = true)
    @Override
    public List<Dept> findAllDept() {
        return deptDao.selectAllDept();
    }

    @Override
    public void addDept(Dept dept) {
        // TODO Auto-generated method stub
        deptDao.save(dept);
    }

    @Override
    public Dept get_Info(Integer id) {
        // TODO Auto-generated method stub
        Dept dept = deptDao.get_Info(id);
        return dept;
    }

    @Override
    public void update_Info(Dept dept) {
        // TODO Auto-generated method stub
        deptDao.update_Info(dept);
    }

    @Override
    public void delete_Info(Integer id) {
        // TODO Auto-generated method stub
        deptDao.delete_Info(id);
    }

    @Override
    public List<Dept> findAllDept(String content) {
        // TODO Auto-generated method stub
        System.out.println(content);
        return deptDao.selectLikeAllDept(content);
    }
}
