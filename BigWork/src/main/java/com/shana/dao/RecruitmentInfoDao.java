package com.shana.dao;

import com.shana.model.Recruitment;
import com.shana.model.RecruitmentInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
public interface RecruitmentInfoDao {
    int addRecruitmentInfo(RecruitmentInfo recruitmentInfo);
    int deleteRecruitmentInfo(int id);
    int updateRecruitment(RecruitmentInfo recruitmentInfo);
    List<RecruitmentInfo> getAllRecruitmentInfo();
    String getByid(int id);
}
