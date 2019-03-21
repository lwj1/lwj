package com.shana.service.impl;

import com.shana.dao.Staff_TrainingDao;
import com.shana.model.Staff_Training;
import com.shana.service.STservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */
@Service
public class STserviceImpl implements STservice{
    @Autowired
    private Staff_TrainingDao staff_trainingDao;

    public boolean addst(Staff_Training staff_training) {
        if(staff_trainingDao.addst(staff_training)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updatest(Staff_Training staff_training) {
        if(staff_trainingDao.updatest(staff_training)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updatest2(Staff_Training staff_training) {
        if(staff_trainingDao.updatest2(staff_training)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Staff_Training> getByStaffid(int staffid) {
        return staff_trainingDao.getByStaffid(staffid);
    }

    public List<Staff_Training> getByTraid(int traid) {
        return staff_trainingDao.getByTraid(traid);
    }
}
