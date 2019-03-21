package com.shana.service;

import com.shana.model.Reconsideration;

import java.util.List;

/**
 * Created by Administrator on 2018/11/2.
 */
public interface ReconsiderationService {
    boolean addreconsideration(Reconsideration reconsideration);
    boolean updatereconsideration(int id);
    Reconsideration getByRewid(int rewid);
    List<Reconsideration> getAll();
    boolean updatereconsideration2(int id);
}
