package com.shana.controller;

import com.shana.model.Department;
import com.shana.model.Staff;
import com.shana.service.DepartmentService;
import com.shana.service.StaffService;
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
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/selectdepartment")
    public String selectdepartment(HttpServletRequest request)throws Exception{
        List<Department> list=departmentService.getAll();
        request.setAttribute("departList",list);
        return "forward:/manageralldepartment.jsp";
    }
    @RequestMapping(value = "/updatedepartment")
    public String updatedepartment(String name,HttpServletRequest request)throws Exception{
        Department department=departmentService.findByName(name);
        request.setAttribute("department",department);
        return "forward:/updatedepartment.jsp";
    }
    @RequestMapping(value = "/updatedepartment2")
    public String updatedepartment2(Department department)throws Exception{
        departmentService.updateDepartment(department);
        return "forward:/selectdepartment";
    }
    @RequestMapping(value = "/adddepartment")
    public String adddepartment(Department department,HttpServletRequest request)throws Exception{
        if(departmentService.findByName(department.getName())==null){
            departmentService.addDepartment(department);
            return "forward:/selectdepartment";
        }else {
            request.setAttribute("msg","该部门已经存在！");
            return "forward:/selectdepartment";
        }

    }
    @RequestMapping(value = "/changeposition")
    public String changeposition(HttpSession session,int id)throws Exception{
        List<Department>list=departmentService.getAll();
        Staff staff=staffService.getStaffById(id);
        session.setAttribute("staff",staff);
        session.setAttribute("departmentList",list);
        return "redirect:/changeposition.jsp";
    }
}
