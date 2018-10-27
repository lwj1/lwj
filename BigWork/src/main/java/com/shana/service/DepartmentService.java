package com.shana.service;

import com.shana.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/20.
 */
public interface DepartmentService {
    boolean addDepartment(Department department);;
    Department findByName(String name);
    boolean deleteDepartment(int id);
    boolean updateDepartment(Department department);
    List<Department> getAll();
    String getDepNameById(int id);
}
