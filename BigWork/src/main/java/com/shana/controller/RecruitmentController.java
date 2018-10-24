package com.shana.controller;

import com.shana.model.Recruitment;
import com.shana.model.Resume;
import com.shana.model.Visiter;
import com.shana.service.RecruitmentInfoService;
import com.shana.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    @RequestMapping(value = "/addrecruitment")
    public String addrecruitment(Recruitment recruitment,HttpServletRequest request)throws Exception{
        System.out.println(recruitment);
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
                list.get(i).setPosname(recruitmentInfoService.getByid(list.get(i).getRecruitmentInfoNo()));
            }
            session.setAttribute("recruitment",list);
            return "forward:/getrecruitment.jsp";
        }

    }
    @RequestMapping(value = "/comfirminterview")
    public void comfirminterview(int rec_id)throws Exception{
        recruitmentService.updateComfirm(rec_id);

    }
    @RequestMapping(value = "/managerlogint")
    public String getallrecruitment(HttpSession session)throws Exception{
       List<Recruitment>list=recruitmentService.getAll();
       session.setAttribute("allrecruitment",list);
       return "../../managerlogin.jsp";

    }
    @RequestMapping(value = "/invitevisiter")
    public String invitevisiter(int id,HttpSession session)throws Exception{


    }
}
