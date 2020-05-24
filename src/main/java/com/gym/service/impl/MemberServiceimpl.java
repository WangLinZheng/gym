package com.gym.service.impl;

import com.gym.dao.MemberDao;
import com.gym.pojo.Member;
import com.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wlz
 * 会员业务层
 */
@Service("memberService")
public class MemberServiceimpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    //业务层 查询会员
    public List<Member> findAll() {
        System.out.println("业务，查询会员");
        List<Member> a = memberDao.findAll();
     //   System.out.println(a);
        return memberDao.findAll();
    }
    //保存会员信息，新增会员
    public Boolean saveMember(Member member) {
        System.out.println("业务，保存账户");
        memberDao.saveMember(member);
        return true;
    }
    //登录功能，查询用户账号密码
    public Member checklogin(Member member) {
        System.out.println("业务层，登录中");
        Member user = memberDao.selByNumberAndPwd(member);
        /*System.out.println(user.toString());*/
        return user;
    }
    //删除用户
    public int delMember(Integer mid) {
        System.out.println("从删除用户");
        return memberDao.delByMid(mid);
    }

    public Member selByMnumber(Integer mnumber) {
        return memberDao.selByMnumber(mnumber);
    }

    public Boolean updateMemberByMnumber(Member member) {
         memberDao.updateMemberByMnumber(member);
         return true;
    }

    public Integer selTotalCount() {
        return memberDao.selTotalCount();
    }


}
