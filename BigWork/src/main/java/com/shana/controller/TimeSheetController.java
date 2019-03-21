package com.shana.controller;

import com.shana.model.Reward;
import com.shana.model.Staff;
import com.shana.model.TimeSheet;
import com.shana.service.RewardService;
import com.shana.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/11/1.
 */
@Controller
public class TimeSheetController {
    @Autowired
    private TimeSheetService timeSheetService;
    @Autowired
    private RewardService rewardService;
    @RequestMapping(value = "signintimesheet")
    public void signtimesheet(HttpSession session, HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        Staff staff= (Staff) session.getAttribute("s");
        SimpleDateFormat sdf=new SimpleDateFormat("%yy-MM%");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        TimeSheet timeSheet=timeSheetService.getByStaffIdAndDay(staff.getId(),sdf.format(new Date()));
        TimeSheet timeSheet1=timeSheetService.getByStaffIdAndDay2(staff.getId(),sdf.format(new Date()));
        TimeSheet timeSheet2=new TimeSheet();
        if(timeSheet==null){
            timeSheet2.setStarttime(sdf2.format(new Date()));
            timeSheet2.setStaffId(staff.getId());
            timeSheetService.addTimeSheet(timeSheet2);
            response.getWriter().print("上班打卡成功");
        }else if(timeSheet1==null){
            Calendar c=Calendar.getInstance();
            Calendar c2=Calendar.getInstance();
            String date=sdf2.format(new Date());
            timeSheet2.setEndtime(date);
            timeSheet2.setStaffId(staff.getId());
            Date starttime=sdf2.parse(timeSheet.getStarttime());
            Date endtime=sdf2.parse(date);
            c.setTime(starttime);
            c2.setTime(endtime);
            Reward reward=new Reward();
            if(endtime.getTime()-starttime.getTime()>1000*60*60*3||c.get(Calendar.HOUR_OF_DAY)>12||c2.get(Calendar.HOUR_OF_DAY)<15){
                timeSheet2.setStatus("旷工");
                reward.setStaffId(staff.getId());
                reward.setReason("旷工");
                reward.setMoney(-staff.getSalary()/20);
                rewardService.addReward(reward);
            }else if(c.get(Calendar.HOUR_OF_DAY)>=9||c2.get(Calendar.HOUR_OF_DAY)<18){
                timeSheet2.setStatus("迟到或早退");
                reward.setStaffId(staff.getId());
                reward.setReason("迟到或早退");
                reward.setMoney(-staff.getSalary()/40);
                rewardService.addReward(reward);
            }else{
                timeSheet2.setStatus("正常");

            }
            System.out.println(timeSheet2);
            timeSheetService.updateTimeSheet(timeSheet2);
            response.getWriter().print("下班打卡成功");
        }else {
            response.getWriter().print("今日已打卡");
        }

    }
}
