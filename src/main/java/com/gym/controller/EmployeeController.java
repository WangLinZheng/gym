package com.gym.controller;


import com.gym.pojo.Employee;
import com.gym.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/toselemployee")
    public String selEmployee(Model model){
        List<Employee> emplist = employeeService.findAllEmp();
        model.addAttribute("emplist",emplist);
        return "selemployee";
    }

    @RequestMapping("/toaddemployee")
    public String toAddEmployee(){
        return "addemployee";
    }

    @RequestMapping("/addemployee")
    public String addEmployee(Employee employee){
        //员工账号1010随机生成
        Random random = new Random();
        String mnum1 = "1010";
        for (int i = 0;i<5;i++){
            mnum1 += random.nextInt(10);
        }
        Integer empnum = Integer.parseInt(mnum1);
        //获取当前日期
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String NowDay = sdf.format(date);
        employee.setEntrytime(NowDay);
        employee.setEmpnumber(empnum);
        employeeService.addEmp(employee);
        return "redirect:toselemployee";
    }

    @RequestMapping("/todelemployee")
    public String toDelEmployee(Model model){
        List<Employee> emplist = employeeService.findAllEmp();
        model.addAttribute("emplist",emplist);
        return "delemployee";
    }

    @RequestMapping("/delemployee")
    public String delEmployee(int empid){
        employeeService.delByEmpId(empid);
        return "redirect:todelemployee";
    }
}
