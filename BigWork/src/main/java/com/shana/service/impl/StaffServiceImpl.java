package com.shana.service.impl;

import com.shana.dao.StaffDao;
import com.shana.model.Staff;
import com.shana.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffDao staffDao;


    public Boolean addStaff(Staff staff) {
        if(staffDao.addStaff(staff)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Staff> getAll() {
        return staffDao.getAll();
    }

    public String getStaffNameById(int id) {
        return staffDao.getStaffNameById(id);
    }

    public Staff getByNameAndPass(Staff staff) {
        return staffDao.getByNameAndPass(staff);
    }

    public int statusChange(int id) {
        return staffDao.statusChange(id);
    }

    public int statusChange2(int id) {
        return staffDao.statusChange2(id);
    }

    public List<Staff> getStaffByNameContain(String name) {
        return staffDao.getStaffByNameContain(name);
    }

    public Staff getStaffById(int id) {
        return staffDao.getStaffById(id);
    }
}
