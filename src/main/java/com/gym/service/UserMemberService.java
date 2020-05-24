package com.gym.service;


import com.gym.pojo.Member;

public interface UserMemberService {

    //查询个人信息
    public Member selByNumber(int mnumber);
}
