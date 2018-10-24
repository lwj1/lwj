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
        return null;
    }
}
