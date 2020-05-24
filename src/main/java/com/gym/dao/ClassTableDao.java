package com.gym.dao;

import com.gym.pojo.ClassOrder;
import com.gym.pojo.ClassTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程表接口
 */
@Repository
public interface ClassTableDao {

    //查询所有课程
    @Select("select * from classtable")
    public List<ClassTable> findClassTable();

    //删除课程
    @Delete("delete from classtable where classid=#{classid}")
    public int delByClassid(Integer classid);

    //添加课程
    @Insert("insert into classtable(classid,classname,classbegin,classtime,teacher) values (#{classid},#{classname},#{classbegin},#{classtime},#{teacher})")
    public  void saveclass(ClassTable classTable);

    //根据id查询课表
    @Select("select * from classtable where classid=#{classid}")
    public ClassTable selByClassId(Integer classid);

    //CONUM删除课程
    @Delete("delete from classorder where conum = #{conum}")
    Boolean delByConum(Integer conum);

}
