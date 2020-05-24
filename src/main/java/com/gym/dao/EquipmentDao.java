package com.gym.dao;


import com.gym.pojo.Equipment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentDao {

    //查询所有器械
    @Select("select * from equipment")
    List<Equipment> findAllEquipment();

    //id删除器械
    @Delete("delete from equipment where eqid = #{eqid}")
    Boolean delByEqID(Integer eqid);

    //添加器材
    @Insert("insert into equipment (eqid,eqname,eqlocation,eqstatus,eqmessage) values (#{eqid},#{eqname},#{eqlocation},#{eqstatus},#{eqmessage})")
    Boolean addEquipment(Equipment equipment);

    //修改器械信息
    @Update("update equipment set eqid=#{eqid},eqname=#{eqname},eqlocation=#{eqlocation},eqstatus=#{eqstatus},eqmessage=#{eqmessage} where eqid=#{eqid}")
    Boolean updateEquipment(Equipment equipment);

    //id查询
    @Select("select * from equipment where eqid=#{eqid}")
    List<Equipment> findByEqId(Integer eqid);

    //查询器械记录总数
    @Select("select count(*) from equipment")
    Integer equtotal();
}
