package com.rain.service.dept;

import com.rain.domain.Dept;

import java.util.List;

/**
 * Created by zhengda on 2019/1/13.
 */
public interface IDepartmentService {
    /**
     * 部门信息的service
     *
     * @param content
     * @return
     */
    List<Dept> findAllDept(String content);

    void addDept(Dept dept);

    Dept get_Info(Integer id);

    void update_Info(Dept dept);

    void delete_Info(Integer id);

    List<Dept> findAllDept();
}
