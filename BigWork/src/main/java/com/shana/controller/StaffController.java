package com.shana.controller;

import com.shana.model.Staff;
import com.shana.service.StaffService;
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
public class StaffController {
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/managerinvite")
    public String invitevisiter(int id, HttpSession session, HttpServletRequest request)throws Exception{
        List<Staff> list=staffService.getAll();
        session.setAttribute("allStaff",list);
        request.setAttribute("id",id);
        return "forward:/managerinvite.jsp";

    }

}
