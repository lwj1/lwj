package com.shana.service.impl;

import com.shana.dao.ReconsiderationDao;
import com.shana.model.Reconsideration;
import com.shana.service.ReconsiderationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/2.
 */
@Service
public class ReconsiderationServiceImpl implements ReconsiderationService{
    @Autowired
    private ReconsiderationDao reconsiderationDao;
    public boolean addreconsideration(Reconsideration reconsideration) {
        if(reconsiderationDao.addreconsideration(reconsideration)!=0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updatereconsideration(int id) {
        if(reconsiderationDao.updatereconsideration(id)!=0){
            return true;
        }else {
            return false;
        }
    }

    public Reconsideration getByRewid(int rewid) {
        return reconsiderationDao.getByRewid(rewid);
    }

    public List<Reconsideration> getAll() {
        return reconsiderationDao.getAll();
    }

    public boolean updatereconsideration2(int id) {
        if(reconsiderationDao.updatereconsideration2(id)!=0){
            return true;
        }else {
            return false;
        }
    }
}
