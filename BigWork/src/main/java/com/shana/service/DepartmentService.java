package com.shana.service;

import com.shana.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/20.
 */
public interface DepartmentService {
    Boolean addDepartment(Department department);
    List<Department> findEmpAndPos();
    Department findByName(String name);
    boolean deleteDepartment(int id);
    boolean updateDepartment(Department department);
    Department findEmp(int id);
}
