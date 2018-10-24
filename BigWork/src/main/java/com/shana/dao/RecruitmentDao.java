package com.shana.dao;

import com.shana.model.Recruitment;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */

public interface RecruitmentDao {
    int addRecruitment(Recruitment recruitment);
    int readRecruitment(int id);
    List<Recruitment> getAll();
    int updateRecruitment(Recruitment recruitment);
    List<Recruitment> getByResid(int resid);
    int updateComfirm(int id);

}
