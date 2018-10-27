package com.shana.dao;

import com.shana.model.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/20.
 */
public interface DepartmentDao {
    int addDepartment(Department department);
    Department findByName(String name);
    int deleteDepartment(int id);
    int updateDepartment(Department department);
    List<Department> getAll();
    String getDepNameById(int id);
}
