package com.gym.service.impl;

import com.gym.dao.ClassOrderDao;
import com.gym.pojo.ClassOrder;
import com.gym.service.ClassOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classorderservice")
public class ClassOrderServiceImpl implements ClassOrderService {


    @Autowired
    private ClassOrderDao classOrderDao;



    public List<ClassOrder> findClassOrder() {
        return classOrderDao.findAllClassOrder();
    }

    public void saveClassOrder(ClassOrder classOrder) {
        classOrderDao.saveClassOrder(classOrder);
    }

    public List<ClassOrder> myClassOrder(Integer conumber) {
        System.out.println("查询我的课表"+conumber);
        return classOrderDao.myClassOrder(conumber);
    }

    public int delByCoid(Integer coid) {
       return classOrderDao.delByCoid(coid);
    }

    public List<ClassOrder> memOrderList(Integer conum) {
        return classOrderDao.memOrderList(conum);
    }

    public ClassOrder selMemberByCoid(Integer conum, Integer conumber) {
        return classOrderDao.selMemberByCoid(conum,conumber);
    }


}
