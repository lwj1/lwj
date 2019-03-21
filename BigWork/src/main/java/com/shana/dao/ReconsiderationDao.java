package com.shana.dao;

import com.shana.model.Reconsideration;

import java.util.List;

/**
 * Created by Administrator on 2018/11/2.
 */
public interface ReconsiderationDao {
    int addreconsideration(Reconsideration reconsideration);
    int updatereconsideration(int id);
    int updatereconsideration2(int id);
    Reconsideration getByRewid(int rewid);
    List<Reconsideration> getAll();

}
