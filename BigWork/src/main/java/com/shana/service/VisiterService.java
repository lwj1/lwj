package com.shana.service;

import com.shana.model.Visiter;

/**
 * Created by Administrator on 2018/10/19.
 */
public interface VisiterService {
    int addVisiter(Visiter visiter);
    Visiter findByNameAndPass(Visiter visiter);
    Visiter findByName(Visiter visiter);

}
