package com.shana.controller;

import com.shana.model.Reward;
import com.shana.model.Training;
import com.shana.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */
@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;
    @RequestMapping(value = "/selectreward")
    public String selectreward(HttpSession session, HttpServletRequest request)throws Exception{
        List<Reward> list=rewardService.getAll();
        session.setAttribute("rewardList",list);
        if(list.isEmpty()){
            request.setAttribute("msg","暂无奖惩信息");
        }
        return "forward:/managerallreward.jsp";
    }
    @RequestMapping(value = "/addreward")
    public String addreward(HttpSession session,Reward reward)throws Exception{
        System.out.println(reward);
        rewardService.addReward(reward);
        return "redirect:/selectreward";
    }
    @RequestMapping(value = "/updatereward")
    public String updatereward(int id,HttpServletRequest request)throws Exception{
       Reward reward=rewardService.getById(id);
        request.setAttribute("reward",reward);
        return "forward:/updatereward.jsp";
    }
    @RequestMapping(value = "/updatereward2")
    public String updatereward2(Reward reward)throws Exception{
        rewardService.updateReward(reward);
        return "forward:/selectreward";
    }
}
