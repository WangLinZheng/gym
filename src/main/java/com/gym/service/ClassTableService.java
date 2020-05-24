package com.gym.service;

import com.gym.pojo.ClassTable;

import java.util.List;

public interface ClassTableService {

    //查询课程信息
    public List<ClassTable> findClassTable();


    //删除课程
    public int delClassId(Integer classId);

    //新增课程
    public void saveClass(ClassTable classTable);

    //id查询课程
    ClassTable selByClassId(Integer classId);

    Boolean delByConum(Integer conum);

}
