package com.gym.dao;

import com.gym.pojo.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMemberDao {

  @Select("select * from member where mnumber=#{mnumber}")
    public Member selByNumber(int mnumber);
}
