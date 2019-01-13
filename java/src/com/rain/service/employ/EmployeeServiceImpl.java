package com.rain.service.employ;

import com.rain.dao.DeptDao;
import com.rain.dao.EmployeeDao;
import com.rain.dao.JobDao;
import com.rain.domain.Dept;
import com.rain.domain.Employee;
import com.rain.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DeptDao deptDao;

    @Autowired
    JobDao jobDao;

    /**
     * 员工信息的管理
     */
    @Override
    public List<Employee> get_EmployeeList() {
        // TODO Auto-generated method stub
        /**
         * 将部门，职位id中的信息提取出来
         */
        List<Employee> list = employeeDao.get_List();
        int size = list.size();
        List<Employee> list2 = new ArrayList<Employee>();
        for (int i = 0; i < size; i++) {
            Employee data = list.get(i);
            Dept dept = deptDao.get_Info(data.getDept_id());
            data.setDept(dept);
            Job job = jobDao.get_Info(data.getJob_id());
            data.setJob(job);
            list2.add(i, data);
        }
        return list2;
    }

    @Override
    public List<Employee> get_EmployeeLikeList(String content) {
        // TODO Auto-generated method stub
        /**
         * 将部门，职位id中的信息提取出来
         */
        List<Employee> list = employeeDao.get_LikeList(content);
        int size = list.size();
        List<Employee> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Employee data = list.get(i);
            Dept dept = deptDao.get_Info(data.getDept_id());
            data.setDept(dept);
            Job job = jobDao.get_Info(data.getJob_id());
            data.setJob(job);
            list2.add(i, data);
        }
        return list2;
    }

    @Override
    public Employee get_EmployeeInfo(Integer id) {
        // TODO Auto-generated method stub
        Employee data = employeeDao.get_Info(id);
        Dept dept = deptDao.get_Info(data.getDept_id());
        data.setDept(dept);
        Job job = jobDao.get_Info(data.getJob_id());
        data.setJob(job);
        return data;
    }

    @Override
    public void update_EmployeeInfo(Employee data) {
        // TODO Auto-generated method stub
        employeeDao.update_Info(data);
    }

    @Override
    public void insert_EmployeeInfo(Employee data) {
        // TODO Auto-generated method stub
        /**
         * 将职位id和部门id提取，或者不管，因为直接存到数据库了，不管
         */
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%te", date);
        data.setCreate_date(year + month + day);
        employeeDao.insert_Info(data);
    }

    @Override
    public void delete_EmployeeInfo(Integer id) {
        // TODO Auto-generated method stub
        employeeDao.delete_Info(id);
    }
}
