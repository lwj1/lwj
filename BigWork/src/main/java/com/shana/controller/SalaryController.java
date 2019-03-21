package com.shana.controller;

import com.shana.model.Reward;
import com.shana.model.Salary;
import com.shana.model.Staff;
import com.shana.model.TimeSheet;
import com.shana.service.RewardService;
import com.shana.service.SalaryService;
import com.shana.service.StaffService;
import com.shana.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/31.
 */
@Controller
public class SalaryController {
    @Autowired
    private SalaryService salaryService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private RewardService rewardService;
    @Autowired
    private TimeSheetService timeSheetService;
    @RequestMapping("/managerallsalary")
    public String managerallsalary(int year, int month, HttpSession session){
        List<Salary> list=salaryService.getallbyYearAndMonth(year,month);
        session.setAttribute("salaryList",list);
        return "redirect:/managerselectsalary.jsp";
    }
    @RequestMapping(value = "/addsalary")
    public @ResponseBody String addsalary(HttpSession session)throws Exception{
        List<Staff> list=staffService.getAll();
        if(list!=null) {
            for (int i = 0; i < list.size(); i++) {
                Salary salary = new Salary();
                salary.setStaffId(list.get(i).getId());
                salary.setBasicpay(list.get(i).getSalary());
                SimpleDateFormat sdf=new SimpleDateFormat("%yy-MM%");
                Calendar c=Calendar.getInstance();
                c.setTime(new Date());
                c.add(Calendar.MONTH,-1);
                List<String>list1=timeSheetService.getEndtimeByStaffIdAndDay(list.get(i).getId(),sdf.format(c.getTime()));
                Reward reward=new Reward();
                reward.setStaffId(list.get(i).getId());
                reward.setMoney(-list.get(i).getSalary()/30*(20-list1.size()));
                reward.setReason("未打卡总计旷工");
                rewardService.addReward2(reward);
                List<Reward> list2=rewardService.getMoneyByStaffIdAndYearMonth(list.get(i).getId(),"%"+sdf.format(c.getTime())+"%");
                double reward1=0;
                if(list2!=null) {
                    for (int j = 0; j < list2.size(); j++) {
                            reward1+=list2.get(j).getMoney();
                        System.out.println();
                    }
                }
                salary.setReward(reward1);
                salaryService.addsalary(salary);


            }
        }
        return "123";
    }
    @RequestMapping(value = "/managerselectsalary")
    public String managerselectsalary(HttpSession session)throws Exception{
        Calendar now = Calendar.getInstance();
        List<Salary>list=salaryService.getallbyYearAndMonth((now.get(Calendar.YEAR)+0),now.get(Calendar.MONTH));
        if(list.isEmpty()){
            session.setAttribute("ok",0);
        }else{
            session.setAttribute("ok",1);
        }
        return "redirect:/managerselectsalary.jsp";
    }
    @RequestMapping(value = "/staffsalary")
    public  String staffsalary(HttpSession session)throws Exception{
        Staff staff= (Staff) session.getAttribute("s");
        List<Salary> list=salaryService.getByStaffId(staff.getId());
        session.setAttribute("salaryList",list);
        return "redirect:/staffsalary.jsp";
    }
}
