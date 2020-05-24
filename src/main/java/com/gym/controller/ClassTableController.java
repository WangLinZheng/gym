package com.gym.controller;

import com.gym.pojo.ClassOrder;
import com.gym.pojo.ClassTable;
import com.gym.service.ClassOrderService;
import com.gym.service.ClassTableService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/classtable")
public class ClassTableController {

    @Autowired
    private ClassTableService classTableService;

    @Autowired
    private ClassOrderService classOrderService;

    //查询课程信息
    @RequestMapping("/findClassTable")
    public ModelAndView findClass(HttpSession session) {
        /*  List<ClassTable> classList = classTableService.findClassTable();
         *//*System.out.println("控制成");
            System.out.println(classList.toString());*//*
            model.addAttribute("classlist",classList);
            System.out.println(model.toString());*/
        ModelAndView mav = new ModelAndView();
        List<ClassTable> classList = classTableService.findClassTable();
        session.setAttribute("classlist",classList);
        mav.addObject("classlist", classList);
        mav.setViewName("selclasstable");
        return mav;
    }


    @RequestMapping("/toselclasstable")
    public String toclasstable() {
        return "redirect:findClassTable";
    }

    //删除课程
    @RequestMapping("/delclass")
    public String delclass(Integer classid) {
        classTableService.delClassId(classid);
        classTableService.delByConum(classid);
        return "redirect:todelclass";
    }

    @RequestMapping("/todelclass")
    public ModelAndView todelclass() {
        ModelAndView mav = new ModelAndView();
        List<ClassTable> classList = classTableService.findClassTable();
        mav.addObject("classlist", classList);
        mav.setViewName("delclass");
        return mav;
    }

    //新增课程
    @RequestMapping("/addclass")
    public String addClass(ClassTable classTable) {
        classTableService.saveClass(classTable);
        return "redirect:findClassTable";
    }

    //跳转新增课程页面
    @RequestMapping("/toaddclass")
    public String toAddClass(){
        return "addclass";
    }

    //跳转会员报名情况
    @RequestMapping("/tomemberorder")
    public String tomemberorder(Model model){
        List<ClassTable> classList = classTableService.findClassTable();
        model.addAttribute("classlist",classList);
        return "memberorderclass";
    }

    @RequestMapping("/findmemberorder")
    public String findMemberOrder(Integer coid,Model model){
        List<ClassOrder> List = classOrderService.memOrderList(coid);
        model.addAttribute("orderlist",List);
        System.out.println(List.toString());
        return "findordermember";
    }


}
