package com.shana.service;

import com.shana.model.Position;

import java.util.List;

/**
 * Created by Administrator on 2018/10/25.
 */
public interface PositionService {
    List<Position> getAllPosition();
    boolean addPosition(Position position);
    boolean deletaPosition(int id);
    Position getPositionByName(String name);
    boolean updatePosition(Position position);
    Position getById(int id);
    String getNameById(int id);
    List<Position> getListByDepNo(int DepNo);
}
