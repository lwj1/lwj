package com.shana.service.impl;


import com.shana.dao.RecruitmentDao;
import com.shana.model.Recruitment;
import com.shana.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
@Service
public class RecruitmentServiceImpl implements RecruitmentService {
    @Autowired
    private RecruitmentDao recruitmentDao;
    public boolean addRecruitment(Recruitment recruitment) {
         if(recruitmentDao.addRecruitment(recruitment)!=0){
             return true;
         }else {
             return false;
         }

    }

    public boolean readRecruitment(int id) {
        if(recruitmentDao.readRecruitment(id)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Recruitment> getAll() {
        return recruitmentDao.getAll();
    }

    public boolean updateRecruitment(Recruitment recruitment) {
        if(recruitmentDao.updateRecruitment(recruitment)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Recruitment> getByResid(int resid) {
        return recruitmentDao.getByResid(resid);
    }

    public boolean updateComfirm(int id) {
        if(recruitmentDao.updateComfirm(id)!=0){
            return true;
        }else {
            return false;
        }

    }
}
