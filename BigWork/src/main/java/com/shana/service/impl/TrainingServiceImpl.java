package com.shana.service.impl;

import com.shana.dao.TrainingDao;
import com.shana.model.Training;
import com.shana.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
@Service
public class TrainingServiceImpl implements TrainingService{
    @Autowired
    private TrainingDao trainingDao;

    public boolean addTraining(Training training) {
        if(trainingDao.addTraining(training)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updateTraining(Training training) {
        if(trainingDao.updateTraining(training)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteTraining(int id) {
        if(trainingDao.deleteTraining(id)!=0){
            return true;
        }else {
            return false;
        }
    }

    public Training getById(int id) {
        return trainingDao.getById(id);
    }

    public List<Training> getAll() {
        return trainingDao.getAll();
    }

    public Training getByName(String name) {
        return trainingDao.getByName(name);
    }
}
