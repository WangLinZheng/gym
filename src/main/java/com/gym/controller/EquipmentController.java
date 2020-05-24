package com.gym.controller;

import com.gym.pojo.Equipment;
import com.gym.service.EquipmentService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/equipmentController")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;


    @RequestMapping("/findEqList")
    public  String  selEquipment(Model model, HttpSession session){
        List<Equipment> eqList = equipmentService.findAllEquipment();
        //System.out.println(eqList.toString());
        session.setAttribute("eqList",eqList);
        model.addAttribute("equipmentlist",eqList);
        return "selequipment";
    }

    @RequestMapping("/delEquipment")
    public String delEquipment(Integer eqid){
        equipmentService.delByEqID(eqid);
        return "redirect:findEqList";
    }

    @RequestMapping("/toUpdateEquipment")
    public String toUpdateEquipment(Integer eqid,Model model){
        List<Equipment> equipmentList = equipmentService.findByEqId(eqid);
        model.addAttribute("eqlist",equipmentList);
        return "updateequipment";
    }

    @RequestMapping("/updateEquipment")
    public String updateEquipment(Equipment equipment){
        System.out.println(equipment.toString());
       equipmentService.updateEquipment(equipment);
        return "redirect:findEqList";
    }

    @RequestMapping("/toAddEquipment")
    public String toAddEquipment(){
        return "addequipment";
    }

    @RequestMapping("/addEquipment")
    public String addEquipment(Equipment equipment){
        equipmentService.addEquipment(equipment);
        return "redirect:findEqList";
    }
}
