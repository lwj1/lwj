package com.shana.controller;

import com.shana.model.Reconsideration;
import com.shana.model.Reward;
import com.shana.service.ReconsiderationService;
import com.shana.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/11/2.
 */
@Controller
public class ReconsiderationController {
    @Autowired
    private ReconsiderationService reconsiderationService;
    @Autowired
    private RewardService rewardService;
    @RequestMapping(value = "/staffreconsideration")
    public String staffconsideration(int id, HttpServletRequest request)throws Exception{
        request.setAttribute("id",id);
        return "forward:/addconsideration.jsp";
    }
    @RequestMapping(value = "/addconsideration")
    public String addconsideration(int rewid,String reason)throws Exception{
        System.out.println(rewid+reason);
        Reconsideration reconsideration=new Reconsideration();
        reconsideration.setReason(reason);
        reconsideration.setRewid(rewid);
        reconsiderationService.addreconsideration(reconsideration);
        return "forward:/staffsalary.jsp";
    }
    @RequestMapping(value = "/managerreconsideration")
    public String managerreconsiderration(HttpSession session)throws Exception{
        List<Reconsideration> list=reconsiderationService.getAll();
        session.setAttribute("reconList",list);
        return "redirect:/managerallconsideration.jsp";
    }
    @RequestMapping(value = "/updatereconsider")
    public String updatereconsider(int id,int rewid,HttpSession session)throws Exception{
        reconsiderationService.updatereconsideration(id);
        Reward reward=rewardService.getById(rewid);
        System.out.println(reward);
        reward.setMoney(-reward.getMoney());
        rewardService.addReward(reward);
        return "redirect:managerreconsideration";
    }
    @RequestMapping(value = "/updatereconsider2")
    public String updatereconsider2(int id,HttpSession session)throws Exception{
        reconsiderationService.updatereconsideration2(id);
        return "redirect:managerreconsideration";
    }
}
