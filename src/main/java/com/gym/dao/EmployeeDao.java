package com.gym.dao;

import com.gym.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {

    //查询所有员工
    @Select("select * from employee")
    List<Employee> findAllEmp();

    //id删除员工
    @Delete("delete from employee where empid = #{empid}")
    int delByEmpId(int empid);

    //添加新员工
    @Insert("insert into employee (empid,empnumber,emppwd,empname,empgender,empage,entrytime,staff,message) values" +
            " (#{empid},#{empnumber},#{emppwd},#{empname},#{empgender},#{empage},#{entrytime},#{staff},#{message})")
    void addEmp(Employee employee);

    //查询员工总记录数
    @Select("select count(*) from employee")
    Integer employeeTotal();
}
