package com.shana.controller;

import com.shana.model.Staff;
import com.shana.model.Staff_Training;
import com.shana.model.Training;
import com.shana.service.STservice;
import com.shana.service.StaffService;
import com.shana.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */
@Controller
public class STController {
    @Autowired
    private STservice sTservice;
    @Autowired
    private TrainingService trainingService;
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/addTS")
    public String addTS(HttpServletRequest request)throws Exception{
        String[] list=request.getParameterValues("id");
        for (int i=0;i<list.length;i++){
            Staff_Training staff_training=new Staff_Training();
            staff_training.setStaffId(Integer.parseInt(list[i]));
            staff_training.setTraId(Integer.parseInt(request.getParameter("tid")));
            sTservice.addst(staff_training);
        }
        return "redirect:selecttraining";
    }
    @RequestMapping(value = "/stafftraining")
    public String stafftraining(HttpSession session)throws Exception{
        Staff staff= (Staff) session.getAttribute("s");
        List<Staff_Training>list=sTservice.getByStaffid(staff.getId());
        List<Training> list1=new ArrayList<Training>();
        for (int i=0;i<list.size();i++){
            Training training=trainingService.getById(list.get(i).getTraId());
            training.setId(list.get(i).getId());
            if (list.get(i).getStatus()==0){
                training.setStatus(0);
            }else if (list.get(i).getStatus()==1){
                training.setStatus(1);
            }else {
                training.setStatus(2);
            }
            list1.add(training);

        }
        session.setAttribute("trainingList",list1);
        return "redirect:/stafftraining.jsp";
    }
    @RequestMapping(value = "/managertrainingstaff")
    public String managertrainingstaff(HttpSession session,int id)throws Exception{
        List<Staff_Training>list=sTservice.getByTraid(id);
        List<Staff> list1=new ArrayList<Staff>();
        for (int i=0;i<list.size();i++){
            Staff staff=staffService.getStaffById(list.get(i).getStaffId());
            staff.setPhone(list.get(i).getStatus());
            if (list.get(i).getStatus()==0){
                staff.setStatus2(0);
            }else if (list.get(i).getStatus()==1){
                staff.setStatus2(1);
            }else {
                staff.setStatus2(2);
            }
            list1.add(staff);

        }
        session.setAttribute("staffList",list1);
        return "redirect:/managertrainingstaff.jsp";
    }
    @RequestMapping(value = "/updateST1")
    public String updateST1(Staff_Training staff_training)throws Exception{
        sTservice.updatest(staff_training);
        return "redirect:stafftraining";
    }
    @RequestMapping(value = "/updateST2")
    public String updateST2(Staff_Training staff_training)throws Exception{
        sTservice.updatest2(staff_training);
        return "redirect:stafftraining";
    }
}
