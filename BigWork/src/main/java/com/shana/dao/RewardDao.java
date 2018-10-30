package com.shana.dao;

import com.shana.model.Reward;

import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
public interface RewardDao{
    int addReward(Reward reward);
    int updateReward(Reward reward);
    List<Reward> getAll();
    List<Reward> getByStaffId(int staffId);
    Reward getById(int id);

}
