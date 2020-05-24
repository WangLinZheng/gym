package com.gym.pojo;

import java.io.Serializable;
/**
 *
 * 管理员账户
 *
 * */
public class Admin implements Serializable {

    private int adminid;
    private String adminaccount;
    private String adminpwd;

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", adminaccount='" + adminaccount + '\'' +
                ", adminpwd='" + adminpwd + '\'' +
                '}';
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }
}
