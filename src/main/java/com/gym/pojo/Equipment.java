package com.gym.pojo;

import java.io.Serializable;

public class Equipment implements Serializable {

    private Integer eqid;
    private String eqname;
    private String eqlocation;
    private String eqstatus;
    private String eqmessage;

    @Override
    public String toString() {
        return "Equipment{" +
                "eqid=" + eqid +
                ", eqname='" + eqname + '\'' +
                ", eqlocation='" + eqlocation + '\'' +
                ", eqstatus='" + eqstatus + '\'' +
                ", eqmessage='" + eqmessage + '\'' +
                '}';
    }

    public Equipment() {

    }

    public Integer getEqid() {
        return eqid;
    }

    public void setEqid(Integer eqid) {
        this.eqid = eqid;
    }

    public String getEqname() {
        return eqname;
    }

    public void setEqname(String eqname) {
        this.eqname = eqname;
    }

    public String getEqlocation() {
        return eqlocation;
    }

    public void setEqlocation(String eqlocation) {
        this.eqlocation = eqlocation;
    }

    public String getEqstatus() {
        return eqstatus;
    }

    public void setEqstatus(String eqstatus) {
        this.eqstatus = eqstatus;
    }

    public String getEqmessage() {
        return eqmessage;
    }

    public void setEqmessage(String eqmessage) {
        this.eqmessage = eqmessage;
    }

    public Equipment(Integer eqid, String eqname, String eqlocation, String eqstatus, String eqmessage) {
        this.eqid = eqid;
        this.eqname = eqname;
        this.eqlocation = eqlocation;
        this.eqstatus = eqstatus;
        this.eqmessage = eqmessage;
    }
}
