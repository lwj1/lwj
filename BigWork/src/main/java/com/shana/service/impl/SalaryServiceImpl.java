package com.shana.service.impl;

import com.shana.dao.SalaryDao;
import com.shana.model.Salary;
import com.shana.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/31.
 */
@Service
public class SalaryServiceImpl implements SalaryService{
    @Autowired
    private SalaryDao salaryDao;

    public boolean addsalary(Salary salary) {
        if(salaryDao.addsalary(salary)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<Salary> getallbyYearAndMonth(int year, int month) {
        return salaryDao.getallbyYearAndMonth(year,month);
    }

    public List<Salary> getByStaffId(int staffId) {
        return salaryDao.getByStaffId(staffId);
    }
}
