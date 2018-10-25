package com.shana.service.impl;

import com.shana.dao.PositionDao;
import com.shana.model.Position;
import com.shana.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/25.
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionDao positionDao;
    public List<Position> getAllPosition() {
        return positionDao.getAllPosition();
    }

    public boolean addPosition(Position position) {
        if(positionDao.addPosition(position)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean deletaPosition(int id) {
        if(positionDao.deletaPosition(id)!=0){
            return true;
        }else {
            return false;
        }
    }

    public Position getPositionByName(String name) {
        return positionDao.getPositionByName(name);
    }

    public boolean updatePosition(Position position) {
        if(positionDao.updatePosition(position)!=0){
            return true;
        }else {
            return false;
        }
    }
}
