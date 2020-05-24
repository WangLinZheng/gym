package com.gym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/logincontroller")
public class LoginController {

    @Autowired
    private MemberController memberController;

    @RequestMapping("/toadminlogin")
    public String toAdminLogin(){
        return "login1";
    }

    @RequestMapping("/tomemberlogin")
    public String toMemberLogin(){
        return "memberlogin1";
    }

}
