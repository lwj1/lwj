package com.shana.service;

import com.shana.model.Staff;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
public interface StaffService {
    Boolean addStaff(Staff staff);
    List<Staff> getAll();
    String getStaffNameById(int id);
}
