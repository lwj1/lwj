package com.shana.service;

import com.shana.model.Staff_Training;

import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */
public interface STservice {
    boolean addst(Staff_Training staff_training);
    boolean updatest(Staff_Training staff_training);
    boolean updatest2(Staff_Training staff_training);
    List<Staff_Training> getByStaffid(int staffid);
    List<Staff_Training> getByTraid(int traid);
}
