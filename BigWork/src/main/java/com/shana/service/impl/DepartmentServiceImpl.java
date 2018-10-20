package com.shana.service.impl;

import com.shana.dao.DepartmentDao;
import com.shana.model.Department;
import com.shana.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/20.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    public Boolean addDepartment(Department department) {
        return null;
    }

    public List<Department> findEmpAndPos() {
        return null;
    }

    public Department findByName(String name) {
        return null;
    }

    public boolean deleteDepartment(int id) {
        return false;
    }

    public boolean updateDepartment(Department department) {
        return false;
    }

    public Department findEmp(int id) {
        return null;
    }
}
