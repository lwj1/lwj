package com.shana.service.impl;

import com.shana.dao.RewardDao;
import com.shana.model.Reward;
import com.shana.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
@Service
public class RewardServiceImpl implements RewardService{
    @Autowired
    private RewardDao rewardDao;
    public boolean addReward(Reward reward) {
        if(rewardDao.addReward(reward)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updateReward(Reward reward) {
        if(rewardDao.updateReward(reward)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Reward> getAll() {
        return rewardDao.getAll();
    }

    public List<Reward> getByStaffId(int staffId) {
        return rewardDao.getByStaffId(staffId);
    }

    public Reward getById(int id) {
        return rewardDao.getById(id);
    }

    public double getMoneyByStaffId(int id) {
        return rewardDao.getMoneyByStaffId(id);
    }

    public List<Reward> getMoneyByStaffIdAndYearMonth(int id,String date) {
        return rewardDao.getMoneyByStaffIdAndYearMonth(id,date);
    }

    public int addReward2(Reward reward) {
        return rewardDao.addReward2(reward);
    }

    public List<Reward> getByStaffIdAndYearMonth(int id, String date) {
        return rewardDao.getByStaffIdAndYearMonth(id,date);
    }
}
