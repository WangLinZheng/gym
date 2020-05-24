package com.gym.test;

import com.gym.service.MemberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
       MemberService ms = (MemberService) ac.getBean("memberService");
        //调用方法
        ms.findAll();
    }
}
