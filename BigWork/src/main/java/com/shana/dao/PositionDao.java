package com.shana.dao;

import com.shana.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/10/23.
 */
public interface PositionDao {
    List<Position> getAllPosition();
    int addPosition(Position position);
    int deletaPosition(int id);
    Position getPositionByName(String name);
    int updatePosition(Position position);
    Position getById(int id);
    String getNameById(int id);
    List<Position> getListByDepNo(int DepNo);
}
