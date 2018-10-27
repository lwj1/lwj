package com.shana.controller;

import com.shana.dao.PositionDao;
import com.shana.model.*;
import com.shana.service.PositionService;
import com.shana.service.RecruitmentInfoService;
import com.shana.service.RecruitmentService;
import com.shana.service.StaffService;
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
public class RecruitmentController {
    @Autowired
    private RecruitmentService recruitmentService;
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private PositionService positionService;
    @RequestMapping(value = "/addrecruitment")
    public String addrecruitment(Recruitment recruitment,HttpServletRequest request)throws Exception{
        if(recruitmentService.getByResidAndRecInfoNo(recruitment)){
            request.setAttribute("msg","你已经投递过该简历了");
            return "forward:/visitLogin.jsp";
        }
        recruitmentService.addRecruitment(recruitment);
        return "../../visitLogin";
    }
    @RequestMapping(value = "getrecruitmentbyresid")
    public String getrecruitmentbyresid(HttpSession session)throws Exception{
        Resume resume= (Resume) session.getAttribute("resume");
        List<Recruitment> list= recruitmentService.getByResid(resume.getId());

        if(list==null||list.isEmpty()){
            session.setAttribute("recruitmentjudge","暂无任何投递信息");
            return "forward:/getrecruitment.jsp";
        }else {
            for(int i=0;i<list.size();i++){
                RecruitmentInfo recruitmentInfo=recruitmentInfoService.getRecruInfoById(list.get(i).getRecruitmentInfoNo());
                list.get(i).setPosname(positionService.getNameById(recruitmentInfo.getPosId()));
                list.get(i).setStaffName(staffService.getStaffNameById(list.get(i).getStaffNo()));
            }
            session.setAttribute("recruitment",list);
            return "forward:/getrecruitment.jsp";
        }

    }
    @RequestMapping(value = "/comfirminterview")
    public void comfirminterview(int res_id, HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        recruitmentService.updateComfirm(res_id);
        response.getWriter().print("确定成功");

    }
    @RequestMapping(value = "/getallrecruitment")
    public String getallrecruitment(HttpSession session)throws Exception {
        List<Recruitment> list = recruitmentService.getAll();
        System.out.println(list);
        if (list == null || list.isEmpty()) {
            session.setAttribute("recruitmentjudge", "暂无任何投递信息");
            return "forward:/managerindex.jsp";
        } else {
            for(int i=0;i<list.size();i++){

                RecruitmentInfo recruitmentInfo=recruitmentInfoService.getRecruInfoById(list.get(i).getRecruitmentInfoNo());
                list.get(i).setPosname(positionService.getNameById(recruitmentInfo.getPosId()));
            }
            session.setAttribute("recruitment",list);
            session.setAttribute("allRecruitment", list);
            return "redirect:/managerRecruitment.jsp";

        }
    }
    @RequestMapping(value = "/interviewAndStaff")
    public String interviewAndStaff(int staffid,String date,String interviewtime,int id)throws Exception{
        Recruitment recruitment=new Recruitment();
        recruitment.setInterviewTime(date+" "+interviewtime);
        recruitment.setStaffNo(staffid);
        recruitment.setId(id);
        recruitmentService.updateRecruitment(recruitment);
        return "redirect:/getallrecruitment";

    }
    @RequestMapping(value = "/updatereadstate")
    public String updatereadstate(int id)throws Exception{

        recruitmentService.readRecruitment(id);
        return "forward:/managergetresume.jsp";

    }

}
