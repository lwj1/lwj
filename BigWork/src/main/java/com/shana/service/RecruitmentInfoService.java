package com.shana.service;

import com.shana.model.RecruitmentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
public interface RecruitmentInfoService {
    boolean addRecruitmentInfo(com.shana.model.RecruitmentInfo recruitmentInfo);
    List<RecruitmentInfo> getAllRecruitmentInfo();
    boolean deleteRecruitmentInfo(int id);
    boolean updateRecruitment(com.shana.model.RecruitmentInfo recruitmentInfo);
    String getByid(int id);
}
