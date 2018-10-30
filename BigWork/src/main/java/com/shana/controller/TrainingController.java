package com.shana.controller;

import com.shana.model.Department;
import com.shana.model.Position;
import com.shana.model.Training;
import com.shana.service.TrainingService;
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
public class TrainingController {
    @Autowired
    private TrainingService trainingService;
    @RequestMapping(value = "/selecttraining")
    public String managergetalltraining(HttpSession session, HttpServletRequest request)throws Exception{
        List<Training> list=trainingService.getAll();
        session.setAttribute("trainingList",list);
        if(list.isEmpty()){
            request.setAttribute("msg","暂无任何培训信息");
        }
        return "forward:/manageralltraining.jsp";
    }
    @RequestMapping(value = "/addtraining")
    public String adddepartment(Training training, HttpServletRequest request)throws Exception{
        if(trainingService.getByName(training.getName())==null){
            trainingService.addTraining(training);
            return "forward:/selecttraining";
        }else {
            request.setAttribute("msg1","该培训已经存在！");
            return "forward:/addtraining.jsp";
        }

    }
    @RequestMapping(value = "/updatetraining")
    public String updatedepartment(String name,HttpServletRequest request)throws Exception{
        Training training=trainingService.getByName(name);
        request.setAttribute("training",training);
        return "forward:/updatetraining.jsp";
    }
    @RequestMapping(value = "/updatetraining2")
    public String updatedepartment2(Training training)throws Exception{
        System.out.println(training);
        trainingService.updateTraining(training);
        return "forward:/selecttraining";
    }
    @RequestMapping(value = "/deletetraining")
    public String deletatraining(Training training)throws Exception{
        trainingService.deleteTraining(training.getId());
        return "forward:/selecttraining";
    }
}
