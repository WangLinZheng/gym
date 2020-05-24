package com.gym.service.impl;

import com.gym.dao.AdminDao;
import com.gym.pojo.Admin;
import com.gym.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin adminLogin(Admin admin) {
        Admin a1 = adminDao.selByAccAndPwd(admin);
        return a1;
    }
}
