package com.rain.service.employ;

import com.rain.domain.Employee;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface IEmployeeService {
    /**
     * 员工信息的service
     */
    List<Employee> get_EmployeeList();

    List<Employee> get_EmployeeLikeList(String content);

    Employee get_EmployeeInfo(Integer id);

    void update_EmployeeInfo(Employee data);

    void insert_EmployeeInfo(Employee data);

    void delete_EmployeeInfo(Integer id);
}
