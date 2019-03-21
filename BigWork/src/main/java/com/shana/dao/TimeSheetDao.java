package com.shana.dao;

import com.shana.model.TimeSheet;

import java.util.List;

/**
 * Created by Administrator on 2018/11/1.
 */
public interface TimeSheetDao {
    int addTimeSheet(TimeSheet timeSheet);
    List<TimeSheet> getByStaffId(int staffId);
    List<TimeSheet> getByYearAndMonth(int year,int month);
    int updateTimeSheet(TimeSheet timeSheet);
    TimeSheet getByStaffIdAndDay(int staffId,String day);
    TimeSheet getByStaffIdAndDay2(int staffId,String day);
    List<String> getEndtimeByStaffIdAndDay(int staffId,String day);
}
