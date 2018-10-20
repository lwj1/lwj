package com.shana.dao;

import com.shana.model.Visiter;

/**
 * Created by Administrator on 2018/10/19.
 */
public interface VisiterDao {
    int addVisiter(Visiter visiter);
    Visiter findByNameAndPass(Visiter visiter);
    Visiter findByName(Visiter visiter);

}
