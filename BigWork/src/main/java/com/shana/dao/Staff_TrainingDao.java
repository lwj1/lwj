package com.shana.dao;

import com.shana.model.Staff_Training;

import java.util.List;

/**
 * Created by Administrator on 2018/11/2.
 */
public interface Staff_TrainingDao {
    int addst(Staff_Training staff_training);
    int updatest(Staff_Training staff_training);
    int updatest2(Staff_Training staff_training);
    List<Staff_Training> getByStaffid(int staffid);
    List<Staff_Training> getByTraid(int traid);
}
