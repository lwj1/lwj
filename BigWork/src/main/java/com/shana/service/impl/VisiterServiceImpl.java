package com.shana.service.impl;

import com.shana.dao.VisiterDao;
import com.shana.model.Visiter;
import com.shana.service.VisiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/19.
 */
@Service
public class VisiterServiceImpl implements VisiterService{
@Autowired
private VisiterDao visiterDao;

    public int addVisiter(Visiter visiter) {
        return visiterDao.addVisiter(visiter);
    }

    public Visiter findByNameAndPass(Visiter visiter) {

        return visiterDao.findByNameAndPass(visiter);
    }

    public Visiter findByName(Visiter visiter) {
        return visiterDao.findByName(visiter);
    }
}
