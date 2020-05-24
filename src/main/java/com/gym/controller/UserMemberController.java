package com.gym.controller;


import com.gym.pojo.ClassOrder;
import com.gym.pojo.ClassTable;
import com.gym.pojo.Member;
import com.gym.service.ClassOrderService;
import com.gym.service.ClassTableService;
import com.gym.service.MemberService;
import com.gym.service.UserMemberService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/usermember")
public class UserMemberController {

    @Autowired
    private UserMemberService userMemberService;

    @Autowired
    private ClassTableService classTableService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private ClassOrderService classOrderService;


    //跳转个人空间
    @RequestMapping("/tomemberzone")
    public String toMemberZone(Model model,HttpSession session) {
        Member member = (Member) session.getAttribute("usermember");
        System.out.println("控制成" + member.toString());
        model.addAttribute("member", member);
        return "memberzone";
    }


    //跳转报名选课页面
    @RequestMapping("/tomemberapplyclass")
    public String toMemberApplyClass(Model model,HttpSession session) {
        Member member = (Member) session.getAttribute("usermember");
        List<ClassTable> classList = classTableService.findClassTable();
        model.addAttribute("member", member);
        model.addAttribute("classlist", classList);
        return "memberapplyclass";
    }

    //跳转会员主页
    @RequestMapping("/tomembermain")
    public String tomembermain(Model model,HttpSession session) {
        Member member = (Member) session.getAttribute("usermember");
        model.addAttribute("member", member);
        return "membermain";
    }


    //会员选课
    @RequestMapping("/saveclassorder")
    public String saveClassOrder(int classid, HttpSession session,Model model) {
        ClassTable classTable = classTableService.selByClassId(classid);
        Member member = (Member) session.getAttribute("usermember");
        Integer conum = classTable.getClassid();
        System.out.println("课程id"+conum);
        String coname = classTable.getClassname();
        String coteacher = classTable.getTeacher();
        String cotime = classTable.getClassbegin();
        String comembername = member.getMname();
        Integer conumber = member.getMnumber();
        ClassOrder classOrder = new ClassOrder(conum,coname,coteacher,comembername,conumber,cotime);
        Integer mnumber = member.getMnumber();
        ClassOrder co1 = classOrderService.selMemberByCoid(classid,mnumber);
        if ( co1 == null){
            classOrderService.saveClassOrder(classOrder);
        }else{
            String ms = "您已经报名过该课程了";
            model.addAttribute("ms",ms);
        }

        System.out.println("报名选课");
        return "redirect:tomyclass";
//        classOrderService.saveClassOrder(new ClassOrder(map.get("coname").toString(),map.get("coteacher").toString(),map.get("coteacher").toString(),Integer.parseInt(map.get("conumber").toString())));

    }

    //跳转我的课程
    @RequestMapping("/tomyclass")
    public String toMyClass(Model model,HttpSession session) {
        Member member = (Member) session.getAttribute("usermember");
        model.addAttribute("member", member);
        int mnumber = member.getMnumber();
        List<ClassOrder> myClassOrder = classOrderService.myClassOrder(mnumber);
        model.addAttribute("myClassOrder", myClassOrder);
        System.out.println("跳转我的课程");
        return "myclass";
    }

    //修改我的信息
    @RequestMapping("/toUpdateMy")
    public String toUpdateMy(HttpSession session,Model model){
        Member member =  (Member) session.getAttribute("usermember");
        model.addAttribute("member", member);
        return "updatemyself";
    }

    //修改我的信息
    @RequestMapping("/updateMy")
    public String updateMy(HttpSession session,Member member){
        Member member1 =  (Member) session.getAttribute("usermember");
        System.out.println(member.getMpwd());
        member.setMid(member1.getMid());
        System.out.println(member1.getMid());
        member.setCardid(member1.getCardid());
        member.setMnumber(member1.getMnumber());
        member.setCardclass(member1.getCardclass());
        member.setCardtime(member1.getCardtime());
        member.setNextclass(member1.getNextclass());
        memberService.updateMemberByMnumber(member);
        return "memberzone";
    }

    @RequestMapping("delmyclass")
    public String delmyclass(int coid) {
        classOrderService.delByCoid(coid);
        return "redirect:tomyclass";
    }
}

