package com.shana.controller;

import com.shana.model.*;
import com.shana.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/10/24.
 */
@Controller
public class StaffController {
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private StaffService staffService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private RecruitmentInfoService recruitmentInfoService;
    @Autowired
    private RecruitmentService recruitmentService;
    @Autowired
    private VisiterService visiterService;
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(value = "/managerinvite")
    public String invitevisiter(int id, HttpSession session, HttpServletRequest request)throws Exception{
        List<Staff> list=staffService.getAll();
        session.setAttribute("allStaff",list);
        request.setAttribute("id",id);
        return "forward:/managerinvite.jsp";

    }
    @RequestMapping(value = "/addStaff")
    public void addStaff(int resumeid, int recinfoid,HttpServletResponse response,int recruitmentid,double salary)throws Exception{
        System.out.println(salary);
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        Staff staff=new Staff();
        Resume  resume=resumeService.findResumeById(resumeid);
        staff.setAge(resume.getAge());
        staff.setEmail(resume.getEmail());
        staff.setName2(resume.getName());
        staff.setPhone(resume.getPhone());
        staff.setSex(resume.getSex());
        Visiter visiter=visiterService.getVisiterById(resume.getVid());
        staff.setName(visiter.getName());
        staff.setPass(visiter.getPass());
        Position position=positionService.getById(recruitmentInfoService.getRecruInfoById(recinfoid).getPosId());
        staff.setPosId(position.getId());
        staff.setDepId(position.getDepNo());
        staff.setSalary(salary);
        staffService.addStaff(staff);
        recruitmentService.updateemploy(recruitmentid);
        staff.setSalary(salary);
        response.getWriter().print("录入成功");
    }
    @RequestMapping(value = "/staffloginJudge")
    public String visitloginJudge(Staff staff, HttpServletRequest request, HttpSession session)throws Exception{
        Staff staff1=staffService.getByNameAndPass(staff);
        if(staff.getName().equals("root")&&staff.getPass().equals("root")){
            return "redirect:/managerindex.jsp";
        }
        if (null!=staff1){
            session.setAttribute("staff",staff1);

            return "forward:/staffLogin.jsp";
        }else {
            request.setAttribute("msg","用户名或密码错误");
            return "forward:/staffindex.jsp";

        }
    }
    @RequestMapping(value = "/staffstatuschange")
    public void staffstatuschange(int id,HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        staffService.statusChange(id);
        response.getWriter().print("转正成功");

    }
    @RequestMapping(value = "/staffstatuschange2")
    public void staffstatuschange2(int id,HttpServletResponse response)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        staffService.statusChange2(id);
        response.getWriter().print("离职成功");

    }
    @RequestMapping(value = "/getallstaff")
    public String getallstaff(HttpSession session)throws Exception{
        List<Staff> list=staffService.getAll();
        session.setAttribute("staffList",list);
        System.out.println(list);
        return "redirect:/managerallstaff.jsp";
    }
    @RequestMapping(value = "/staffpositionchange")
    public String staffpositionchange(HttpServletRequest request,String name,HttpServletResponse response)throws Exception{
        String name1="%"+name+"%";
        List<Staff> list=staffService.getStaffByNameContain(name1);
        for(int i=0;i<list.size();i++){
            list.get(i).setPosName(positionService.getNameById(list.get(i).getPosId()));
            list.get(i).setDepName(departmentService.getDepNameById(list.get(i).getDepId()));
        }
        if(null!=list){
            request.setAttribute("staffList2",list);
            return "forward:/managerselectstaff.jsp";
        }else {
            request.setAttribute("staffList2",null);
            request.setAttribute("msg","查询不到该姓名");
            return "forward:/managerselectstaff.jsp";
        }
    }
    @RequestMapping(value = "changeposition3")
    public  @ResponseBody String changeposition3(Staff staff)throws Exception{
        Staff staff1=staffService.getStaffById(staff.getId());
        if(staff1.getDepId()==staff.getDepId()&&staff1.getPosId()==staff.getPosId()){
            return "换岗失败，该员工本就是该职位";
        }else {
            staffService.updateDepIdAndPosId(staff);
            return "换岗成功";

        }
    }
    @RequestMapping(value = "/rewardfindstaff")
    public @ResponseBody void rewardfindstaff(HttpServletResponse response,int id)throws Exception{
        response.setContentType("text/text;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        if(staffService.getStaffById(id)==null){
            response.getWriter().print("不存在该员工");
        }else {
            response.getWriter().print("null");
        }
    }

}
