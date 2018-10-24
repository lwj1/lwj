package com.shana.controller;

import com.shana.model.Recruitment;
import com.shana.model.RecruitmentInfo;
import com.shana.model.Resume;
import com.shana.model.Visiter;
import com.shana.service.RecruitmentInfoService;
import com.shana.service.RecruitmentService;
import com.shana.service.ResumeService;
import com.shana.service.VisiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2018/10/19.
 */
@Controller
public class VisiterController {
    @Autowired
    private VisiterService visiterService;
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private RecruitmentService recruitmentService;
    @RequestMapping(value = "/visitloginJudge")
    public String visitloginJudge(@ModelAttribute("visiter") Visiter visiter, HttpServletRequest request,HttpSession session)throws Exception{
        Visiter visiter1=visiterService.findByNameAndPass(visiter);
        if (null!=visiter1){
            Resume resume=resumeService.findResumeByVid(visiter1.getId());
            session.setAttribute("resume",resume);
            session.setAttribute("visiter",visiter1);
            List<RecruitmentInfo> recInfo=recruitmentInfoService.getAllRecruitmentInfo();
            session.setAttribute("recInfo",recInfo);
            return "../../visitLogin";
        }else {
            request.setAttribute("msg","用户名或密码错误");
            return "forward:/index.jsp";

        }
    }
    @RequestMapping(value = "/visiterregister")
    public String visiterregister(Visiter visiter,HttpServletRequest request)throws Exception{
        if(visiter.getName()==null||visiter.getName()==""){
            request.setAttribute("msg","用户名不能为空");
            return "redirect:/register.jsp";
        }else {
        visiterService.addVisiter(visiter);
        return "redirect:/visitersuccess.jsp";}
    }
    @RequestMapping(value = "/visiternamejudge")
    public void visiternamejudge(HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        Visiter visiter=new Visiter(name);
        Visiter visiter1=visiterService.findByName(visiter);
        if (name==null||name==""){
            response.getWriter().print("abc");
        }
        else if (null!=visiter1){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

}
