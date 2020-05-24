package com.gym.service;

import com.gym.pojo.Equipment;

import java.util.List;

public interface EquipmentService {

    //查询所有器械

    List<Equipment> findAllEquipment();

    //id删除器械

    Boolean delByEqID(Integer eqid);

    //添加器材

    Boolean addEquipment(Equipment equipment);

    //修改器械信息

    Boolean updateEquipment(Equipment equipment);

    //id查器械
    List<Equipment> findByEqId(Integer eqid);

    //查询器械总数
    Integer equtotal();
}
