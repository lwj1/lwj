package com.shana.controller;

import com.shana.model.Department;
import com.shana.model.Position;
import com.shana.model.Staff;
import com.shana.service.DepartmentService;
import com.shana.service.PositionService;
import com.shana.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/26.
 */
@Controller
public class PositionController {
    @Autowired
    private PositionService positionService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/selectposition")
    public String recruitmentInfoPosition(HttpSession session)throws Exception{
        List<Position> list=positionService.getAllPosition();
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).setDepName(departmentService.getDepNameById(list.get(i).getDepNo()));
        }
        List<Department> list1=departmentService.getAll();
       session.setAttribute("departList",list1);
       session.setAttribute("positionList",list);
        return "forward:/managerallposition.jsp";
    }
    @RequestMapping(value = "/updateposition")
    public String updatedepartment(String name,HttpServletRequest request)throws Exception{
        Position position=positionService.getPositionByName(name);
        position.setDepName(departmentService.getDepNameById(position.getDepNo()));
        request.setAttribute("position",position);
        return "forward:/updateposition.jsp";
    }
    @RequestMapping(value = "/updateposition2")
    public String updatedepartment2(Position position)throws Exception{
        positionService.updatePosition(position);
        return "forward:/selectposition";
    }
    @RequestMapping(value = "/addposition")
    public String adddepartment(Position position,HttpServletRequest request)throws Exception{
        if(positionService.getPositionByName(position.getName())==null){
            positionService.addPosition(position);
            return "forward:/selectposition";
        }else {
            request.setAttribute("msg","该职位已经存在！");
            return "forward:/selectposition";
        }

    }
    @RequestMapping(value = "changeposition2")
    public @ResponseBody List<Position> changeposition2(int DepNo)throws Exception{
        List<Position>list=positionService.getListByDepNo(DepNo);
        return list;
    }
    @RequestMapping(value = "/deleteposition")
    public void deleteposition(int id, HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        List<Staff>list=staffService.getByposNo(id);
        if(list.size()!=0){
            response.getWriter().print("该职位下有员工不可删除");
        }else {
            positionService.deletaPosition(id);
        }
    }

}
