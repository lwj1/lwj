package com.shana.controller;

import com.shana.model.Recruitment;
import com.shana.model.RecruitmentInfo;
import com.shana.service.RecruitmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/26.
 */
@Controller
public class RecruitmentInfoController {
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @RequestMapping(value = "/addRecruitment")
    public String addRecruitment(RecruitmentInfo recruitmentInfo)throws Exception{
        recruitmentInfoService.addRecruitmentInfo(recruitmentInfo);
        return "redirect:/addOrUpdateRecruitment.jsp";
    }
    @RequestMapping(value = "/updateRecruitment")
    public String updateRecruitment(RecruitmentInfo recruitmentInfo)throws Exception{
        recruitmentInfoService.updateRecruitment(recruitmentInfo);
        return "redirect:/addOrUpdateRecruitment.jsp";
    }
    @RequestMapping(value = "/updateRecruitment")
    public String selectRecruitment(HttpSession session)throws Exception{
        List<RecruitmentInfo> list=recruitmentInfoService.getAllRecruitmentInfo();
        session.setAttribute("RecruitmentInFoList",list);
        return "redirect:/addOrUpdateRecruitment.jsp";
    }
}
