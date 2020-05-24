package com.gym.service.impl;

import com.gym.dao.ClassTableDao;
import com.gym.pojo.ClassTable;
import com.gym.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classtableservice")
public class ClassTableServiceImpl implements ClassTableService {

    @Autowired
    private ClassTableDao classTableDao;

    //查询所有课程信息
    public List<ClassTable> findClassTable() {
        System.out.println("查询课程");
       // System.out.println(classTableDao.findClassTable().toString());
        return classTableDao.findClassTable();
    }

    //删除课程
    public int delClassId(Integer classId){
        return classTableDao.delByClassid(classId);
    }

    //新增课程
    public void saveClass(ClassTable classTable) {
        classTableDao.saveclass(classTable);
    }


    //id查询课程
    public ClassTable selByClassId(Integer classId) {
        return classTableDao.selByClassId(classId);
    }

    public Boolean delByConum(Integer conum) {
        return classTableDao.delByConum(conum);
    }


}
