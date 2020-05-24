package com.gym.service;

import com.gym.pojo.ClassOrder;

import java.util.List;

public interface ClassOrderService {

    //查询报名表信息
    public List<ClassOrder> findClassOrder();

    //添加报名报信息，会员选课
    public void saveClassOrder(ClassOrder classOrder);

    //id查询个人报名
    List<ClassOrder> myClassOrder(Integer conumber);

    //id删除我的课程
    int delByCoid(Integer coid);

    //会员报名情况
    List<ClassOrder> memOrderList(Integer conum);

    //查询会员是否报名该课程
    ClassOrder selMemberByCoid(Integer conum,Integer conumber);
}
