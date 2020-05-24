package com.gym.service;

import com.gym.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    //查询所有员工
    List<Employee> findAllEmp();

    //id删除员工
    int delByEmpId(int empid);

    //添加员工
    void addEmp(Employee employee);

    //查询员工总数
    Integer employeeTotal();
}
