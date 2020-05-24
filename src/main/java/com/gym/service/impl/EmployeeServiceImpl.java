package com.gym.service.impl;

import com.gym.dao.EmployeeDao;
import com.gym.pojo.Employee;
import com.gym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeservice")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> findAllEmp() {
        return employeeDao.findAllEmp();
    }

    public int delByEmpId(int empid) {
        return employeeDao.delByEmpId(empid);
    }

    public void addEmp(Employee employee) {
        employeeDao.addEmp(employee);
    }

    public Integer employeeTotal() {
        return employeeDao.employeeTotal();
    }

}
