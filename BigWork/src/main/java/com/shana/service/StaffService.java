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
    Staff getByNameAndPass(Staff staff);
    int statusChange(int id);
    int statusChange2(int id);
    List<Staff> getStaffByNameContain(String name);
    Staff getStaffById(int id);
   Boolean updateDepIdAndPosId(Staff staff);
    List<Staff> getByDepAndPos(Staff staff);
    boolean updatestaff(Staff staff);
    List<Staff> getBydepNo(int depNo);
    List<Staff> getByposNo(int posNo);
}
