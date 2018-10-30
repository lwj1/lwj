package com.shana.service;

import com.shana.model.Training;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
public interface TrainingService {
    boolean addTraining(Training training);
    boolean updateTraining(Training training);
    boolean deleteTraining(int id);
    Training getById(int id);
    List<Training> getAll();
    Training getByName(String name);
}
