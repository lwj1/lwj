package com.shana.controller;

import com.shana.model.Position;
import com.shana.model.Recruitment;
import com.shana.model.RecruitmentInfo;
import com.shana.service.PositionService;
import com.shana.service.RecruitmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/26.
 */
@Controller
public class RecruitmentInfoController {
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @Autowired
    private PositionService positionService;
    @RequestMapping(value = "/addRecruitmentInfo")
    public String addRecruitment(RecruitmentInfo recruitmentInfo)throws Exception{
        recruitmentInfoService.addRecruitmentInfo(recruitmentInfo);
        return "redirect:/selectRecruitmentInfo";
    }
    @RequestMapping(value = "/updateRecruitmentInfo")
    public String updateRecruitment(int id, HttpServletRequest request)throws Exception{
        RecruitmentInfo recruitmentInfo=recruitmentInfoService.getRecruInfoById(id);
        List<Position> list=positionService.getAllPosition();
        request.setAttribute("positionList",list);
        request.setAttribute("recruInfo",recruitmentInfo);
        return "forward:/updateRecruitmentInfo.jsp";
    }
    @RequestMapping(value = "/updateRecruitmentInfo2")
    public String updateRecruitment2(RecruitmentInfo recruitmentInfo)throws Exception{
       recruitmentInfoService.updateRecruitment(recruitmentInfo);
        return "redirect:/selectRecruitmentInfo";
    }
    @RequestMapping(value = "/selectRecruitmentInfo")
    public String selectRecruitment(HttpSession session)throws Exception{
        List<RecruitmentInfo> list=recruitmentInfoService.getAllRecruitmentInfo();
        for(int i=0;i<list.size();i++){
            list.get(i).setPosName(positionService.getNameById(list.get(i).getPosId()));
        }
        session.setAttribute("RecruitmentInFoList",list);

        return "redirect:/managergetallrecruitmentinfo.jsp";
    }
    @RequestMapping(value = "/deleteRecruitmentInfo")
    public String deleteRecruitmentInfo(int id)throws Exception{
        recruitmentInfoService.deleteRecruitmentInfo(id);
        return "redirect:/selectRecruitmentInfo";
    }
}
