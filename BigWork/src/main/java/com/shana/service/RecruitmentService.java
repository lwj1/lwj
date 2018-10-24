package com.shana.service;

import com.shana.model.Recruitment;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
public interface RecruitmentService {
    boolean addRecruitment(Recruitment recruitment);
    boolean readRecruitment(int id);
    List<Recruitment> getAll();
    boolean updateRecruitment(Recruitment recruitment);
    List<Recruitment> getByResid(int resid);
    boolean updateComfirm(int id);
}
