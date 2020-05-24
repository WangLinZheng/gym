package com.gym.pojo;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empid;
    private int empnumber;
    private String emppwd;
    private String empname;
    private String empgender;
    private int empage;
    private String entrytime;
    private String staff; //职务
    private String message; //备注信息

    public Employee(int empid, int empnumber, String emppwd, String empname, String empgender, int empage, String entrytime, String staff, String message) {
        this.empid = empid;
        this.empnumber = empnumber;
        this.emppwd = emppwd;
        this.empname = empname;
        this.empgender = empgender;
        this.empage = empage;
        this.entrytime = entrytime;
        this.staff = staff;
        this.message = message;
    }

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empnumber=" + empnumber +
                ", emppwd='" + emppwd + '\'' +
                ", empname='" + empname + '\'' +
                ", empgender='" + empgender + '\'' +
                ", empage=" + empage +
                ", entrytime='" + entrytime + '\'' +
                ", staff='" + staff + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpnumber() {
        return empnumber;
    }

    public void setEmpnumber(int empnumber) {
        this.empnumber = empnumber;
    }

    public String getEmppwd() {
        return emppwd;
    }

    public void setEmppwd(String emppwd) {
        this.emppwd = emppwd;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpgender() {
        return empgender;
    }

    public void setEmpgender(String empgender) {
        this.empgender = empgender;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
