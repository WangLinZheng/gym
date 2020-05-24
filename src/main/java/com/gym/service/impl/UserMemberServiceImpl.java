package com.gym.service.impl;

import com.gym.dao.UserMemberDao;
import com.gym.pojo.Member;
import com.gym.service.UserMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("usermemberservice")
public class UserMemberServiceImpl implements UserMemberService {

    @Autowired
    private UserMemberDao userMemberDao;

    //查询个人信息
    public Member selByNumber(int mnumber) {
        Member member = userMemberDao.selByNumber(mnumber);
    //    System.out.println("查询个人信息业务层");
       // System.out.println(member.toString());
        return member;
    }
}
