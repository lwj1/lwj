package com.shana.service.impl;

import com.shana.dao.TimeSheetDao;
import com.shana.model.Staff;
import com.shana.model.TimeSheet;
import com.shana.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/11/1.
 */
@Service
public class TimeSheetServiceImpl implements TimeSheetService{
    @Autowired
    private TimeSheetDao timeSheetDao;


    public boolean addTimeSheet(TimeSheet timeSheet) {
        if(timeSheetDao.addTimeSheet(timeSheet)!=0){
            return true;
        }else {
            return false;
        }
    }

    public List<TimeSheet> getByStaffId(int staffId) {
        return timeSheetDao.getByStaffId(staffId);
    }

    public List<TimeSheet> getByYearAndMonth(int year, int month) {
        return timeSheetDao.getByYearAndMonth(year,month);
    }

    public boolean updateTimeSheet(TimeSheet timeSheet) {
        if(timeSheetDao.updateTimeSheet(timeSheet)!=0){
            return true;
        }else {
            return false;
        }
    }

    public TimeSheet getByStaffIdAndDay(int staffId, String day) {
        return timeSheetDao.getByStaffIdAndDay(staffId,day);
    }

    public TimeSheet getByStaffIdAndDay2(int staffId, String day) {
        return timeSheetDao.getByStaffIdAndDay2(staffId, day);
    }

    public List<String> getEndtimeByStaffIdAndDay(int staffId, String day) {
        return timeSheetDao.getEndtimeByStaffIdAndDay(staffId, day);
    }
}
