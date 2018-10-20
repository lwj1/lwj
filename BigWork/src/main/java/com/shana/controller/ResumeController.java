package com.shana.controller;

import com.shana.model.Resume;
import com.shana.model.Visiter;
import com.shana.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/20.
 */
@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @RequestMapping(value = "/addresume")
    public String addresume(HttpServletRequest request)throws Exception{
            Resume resume=new Resume();
            Visiter visiter= (Visiter) request.getSession().getAttribute("visiter");
            resume.setVid(visiter.getId());
            resume.setAge(Integer.parseInt(request.getParameter("age")));
            resume.setBirth(request.getParameter("birth"));
            resume.setName(request.getParameter("name"));
            resume.setSex(request.getParameter("sex"));
            resume.setNation(request.getParameter("nation"));
            resume.setPhone(Integer.parseInt(request.getParameter("phone")));
            resume.setEmail(request.getParameter("email"));
            resume.setMarrige(request.getParameter("marrige"));
            resume.setEducation(request.getParameter("education"));
            resume.setGraduateSchool(request.getParameter("graduateSchool"));
            resume.setMajor(request.getParameter("major"));
            resume.setSelfassessment(request.getParameter("selfassessment"));
            resume.setJobDesire(request.getParameter("jobDesire"));
            resume.setExperience(request.getParameter("experience"));
            resume.setSalaryExpectation(Integer.parseInt(request.getParameter("salaryExpectation")));

            resumeService.addResume(resume);
            return "redirect:/addresumeback";
    }
    @RequestMapping(value = "/resumefind")
    public String resumefind(HttpServletRequest request)throws Exception{
        Visiter visiter= (Visiter) request.getSession().getAttribute("visiter");
        Resume resume=resumeService.findResumeByVid(visiter.getId());
        request.setAttribute("resume",resume);
        return "forward:/updateresume.jsp";
    }
    @RequestMapping(value = "/addresumeback")
    public String addresumeback(HttpServletRequest request)throws Exception{
        Visiter visiter= (Visiter) request.getSession().getAttribute("visiter");
            Resume resume=resumeService.findResumeByVid(visiter.getId());
            request.getSession().setAttribute("resume",resume);
            return "../../visitLogin";
    }
    @RequestMapping(value = "/updateresume")
    public String updateresume(HttpServletRequest request)throws Exception{
        Resume resume=new Resume();
        Visiter visiter= (Visiter) request.getSession().getAttribute("visiter");
        System.out.println(request.getParameter("name"));
        resume.setVid(visiter.getId());
        resume.setAge(Integer.parseInt(request.getParameter("age")));
        resume.setBirth(request.getParameter("birth"));
        resume.setName(request.getParameter("name"));
        resume.setSex(request.getParameter("sex"));
        resume.setNation(request.getParameter("nation"));
        resume.setPhone(Integer.parseInt(request.getParameter("phone")));
        resume.setEmail(request.getParameter("email"));
        resume.setMarrige(request.getParameter("marrige"));
        resume.setEducation(request.getParameter("education"));
        resume.setGraduateSchool(request.getParameter("graduateSchool"));
        resume.setMajor(request.getParameter("major"));
        resume.setSelfassessment(request.getParameter("selfassessment"));
        resume.setJobDesire(request.getParameter("jobDesire"));
        resume.setExperience(request.getParameter("experience"));
        resume.setSalaryExpectation(Integer.parseInt(request.getParameter("salaryExpectation")));

        resumeService.UpdateResumeByVid(resume);
        return "redirect:/addresumeback";
    }
}
