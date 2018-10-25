package com.shana.controller;

import com.shana.model.*;
import com.shana.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
@Controller
public class StaffController {
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @Autowired
    private RecruitmentService recruitmentService;
    @Autowired
    private VisiterService visiterService;
    @RequestMapping(value = "/managerinvite")
    public String invitevisiter(int id, HttpSession session, HttpServletRequest request)throws Exception{
        List<Staff> list=staffService.getAll();
        session.setAttribute("allStaff",list);
        request.setAttribute("id",id);
        return "forward:/managerinvite.jsp";

    }
    @RequestMapping(value = "/addStaff")
    public void addStaff(int resumeid, int recinfoid,HttpServletResponse response,int recruitmentid)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        Staff staff=new Staff();
        Resume  resume=resumeService.findResumeById(resumeid);
        staff.setAge(resume.getAge());
        staff.setEmail(resume.getEmail());
        staff.setName2(resume.getName());
        staff.setPhone(resume.getPhone());
        staff.setSex(resume.getSex());
        Visiter visiter=visiterService.getVisiterById(resume.getVid());
        staff.setName(visiter.getName());
        staff.setPass(visiter.getPass());
        Position position=positionService.getPositionByName(recruitmentInfoService.getByid(recinfoid));
        staff.setPosId(position.getId());
        System.out.println(position.getDepNo());
        staff.setDepId(position.getDepNo());
        staffService.addStaff(staff);
        recruitmentService.updateemploy(recruitmentid);
        response.getWriter().print("录入成功");


    }
}
