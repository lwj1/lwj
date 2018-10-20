package com.shana.dao;

import com.shana.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/20.
 */
public interface DepartmentDao {
    int addDepartment(Department department);
    List<Department> findEmpAndPos();
    Department findByName(String name);
    int deleteDepartment(int id);
    int updateDepartment(Department department);
    Department findEmp(int id);
}
