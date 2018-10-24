package com.shana.service.impl;

import com.shana.dao.RecruitmentInfoDao;
import com.shana.model.RecruitmentInfo;
import com.shana.service.RecruitmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
@Service
public class RecruitmentInfoServiceImpl implements RecruitmentInfoService{
    @Autowired
    private RecruitmentInfoDao recruitmentInfoDao;
    public boolean addRecruitmentInfo(RecruitmentInfo recruitmentInfo) {
        if(recruitmentInfoDao.addRecruitmentInfo(recruitmentInfo)!=0){
            return true;
        }else
            return false;
    }

    public List<RecruitmentInfo> getAllRecruitmentInfo() {
        return recruitmentInfoDao.getAllRecruitmentInfo();
    }


    public boolean deleteRecruitmentInfo(int id) {
        if(recruitmentInfoDao.deleteRecruitmentInfo(id)!=0){
            return true;
        }else
            return false;
    }

    public boolean updateRecruitment(RecruitmentInfo recruitmentInfo) {

        if(recruitmentInfoDao.updateRecruitment(recruitmentInfo)!=0){
            return true;
        }else
            return false;
    }

    public String getByid(int id) {
        return recruitmentInfoDao.getByid(id);
    }
}
