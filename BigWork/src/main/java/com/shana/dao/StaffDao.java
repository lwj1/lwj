package com.shana.dao;

import com.shana.model.Staff;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
public interface StaffDao {
    int addStaff(Staff staff);
    List<Staff> getAll();
    String getStaffNameById(int id);

}
