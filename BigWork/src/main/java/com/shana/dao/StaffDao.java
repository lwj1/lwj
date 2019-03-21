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
    Staff getByNameAndPass(Staff staff);
    int statusChange(int id);
    int statusChange2(int id);
    List<Staff> getStaffByNameContain(String name);
    Staff getStaffById(int id);
    int updateDepIdAndPosId(Staff staff);
    List<Staff> getByDepAndPos(Staff staff);
    int updatestaff(Staff staff);
    List<Staff> getBydepNo(int depNo);
    List<Staff> getByposNo(int posNo);
}
