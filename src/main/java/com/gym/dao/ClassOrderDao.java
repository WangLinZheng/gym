package com.gym.dao;


import com.gym.pojo.ClassOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassOrderDao {

    //查询所有报名表信息
    @Select("select * from classorder")
    public List<ClassOrder> findAllClassOrder();

    //添加报名信息
    @Insert("insert into classorder(coid,conum,coname,coteacher,comembername,conumber,cotime) values (#{coid},#{conum},#{coname},#{coteacher},#{comembername},#{conumber},#{cotime})")
    public void saveClassOrder(ClassOrder classOrder);

    //id查询个人报名
    @Select("select * from classorder where conumber = #{conumber}")
    public List<ClassOrder> myClassOrder(Integer conumber);

    //删除我的课程
    @Delete("delete from classorder where coid = #{coid}")
    int delByCoid(Integer coid);

    //查询会员是否报名该课程
    @Select("select * from classorder where conum = #{conum} and conumber = #{conumber}")
    ClassOrder selMemberByCoid(@Param("conum") Integer conum, @Param("conumber") Integer conumber);

    //查询会员报名情况
    @Select("select * from classorder where conum=#{conum}")
    List<ClassOrder> memOrderList(Integer conum);
}
