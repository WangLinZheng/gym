package com.gym.service.impl;

import com.gym.dao.EquipmentDao;
import com.gym.pojo.Equipment;
import com.gym.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("EquipmentService")
public class EquipmentServiceImpl implements EquipmentService {


    @Autowired
    private EquipmentDao equipmentDao;


    public List<Equipment> findAllEquipment() {
        return equipmentDao.findAllEquipment();
    }

    public Boolean delByEqID(Integer eqid) {
        return equipmentDao.delByEqID(eqid);
    }

    public Boolean addEquipment(Equipment equipment) {
        return equipmentDao.addEquipment(equipment);
    }

    public Boolean updateEquipment(Equipment equipment) {
        return equipmentDao.updateEquipment(equipment);
    }

    public List<Equipment> findByEqId(Integer eqid) {
        return equipmentDao.findByEqId(eqid);
    }

    public Integer equtotal() {
        return equipmentDao.equtotal();
    }
}
