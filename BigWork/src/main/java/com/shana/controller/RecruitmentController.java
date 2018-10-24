package com.shana.controller;

import com.shana.model.Recruitment;
import com.shana.model.Visiter;
import com.shana.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/10/24.
 */
@Controller
public class RecruitmentController {
    @Autowired
    private RecruitmentService recruitmentService;
    @RequestMapping(value = "/addrecruitment")
    public String visiterregister(Recruitment recruitment, HttpServletRequest request)throws Exception{
        re
    }
}
