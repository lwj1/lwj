package com.shana.service;

import com.shana.model.Salary;

import java.util.List;

/**
 * Created by Administrator on 2018/10/31.
 */
public interface SalaryService {
    boolean addsalary(Salary salary);
    List<Salary> getallbyYearAndMonth(int year, int month);
    List<Salary> getByStaffId(int staffId);

}
