package com.gym.dao;

import com.gym.pojo.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员接口
 */
@Repository
public interface MemberDao {

    //查询会员信息
    @Select("select * from member")
    public List<Member> findAll();


    //新增会员信息
    @Insert("insert into member (mid,mnumber,mname,mgender,mage,mheight,mweight,mphone,cardid,cardtime,cardclass,nextclass) " +
            "values (#{mid},#{mnumber},#{mname},#{mgender},#{mage},#{mheight},#{mweight},#{mphone},#{cardid},#{cardtime},#{cardclass},#{nextclass})")
     Boolean saveMember(Member member);


    //根据id修改会员信息
    @Update("update member set mid = #{mid},mnumber = #{mnumber}, mpwd = #{mpwd},mname=#{mname},mgender=#{mgender},mage=#{mage},mheight=#{mheight},mweight=#{mweight}," +
            "mphone=#{mphone},cardid=#{cardid},cardclass=#{cardclass},nextclass=#{nextclass} where mid=#{mid}")
    Boolean updateMemberByMnumber(Member member);



    //查询用户账号密码
    @Select("select * from member where mnumber=#{mnumber} and mpwd=#{mpwd}")
     Member selByNumberAndPwd(Member member);

    //根据id删除会员信息
    @Delete("delete from member where mid=#{mid}")
     int delByMid(Integer mid);

    //查询记录总数
    @Select("select count(*) from member")
    Integer selTotalCount();

    //根据会员卡账号查询会员
    @Select("select * from member where mnumber = #{mnumber}")
    Member selByMnumber(Integer mnumber);


}

