package com.gym.dao;

import com.gym.pojo.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 管理员账户
 */
@Repository
public interface AdminDao {

    @Select("select * from admin where adminaccount=#{adminaccount} and adminpwd=#{adminpwd}")
    public Admin selByAccAndPwd(Admin admin);
}
