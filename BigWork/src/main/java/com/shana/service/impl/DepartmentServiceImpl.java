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
    public boolean addDepartment(Department department) {

        ;if(departmentDao.addDepartment(department)!=0){
            return true;
        }else {
            return false;
        }
    }


    public Department findByName(String name) {
        return departmentDao.findByName(name);
    }

    public boolean deleteDepartment(int id) {
        if(departmentDao.deleteDepartment(id)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updateDepartment(Department department) {
        if(departmentDao.updateDepartment(department)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Department> getAll() {
        return departmentDao.getAll();
    }

    public String getDepNameById(int id) {
        return departmentDao.getDepNameById(id);
    }

}
