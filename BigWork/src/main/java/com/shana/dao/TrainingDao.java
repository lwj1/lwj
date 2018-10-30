package com.shana.dao;

import com.shana.model.Training;

import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
public interface TrainingDao {
    int addTraining(Training  training);
    int updateTraining(Training training);
    int deleteTraining(int id);
    Training getById(int id);
    List<Training> getAll();
    Training getByName(String name);
}
