package com.gym.pojo;

import java.io.Serializable;

public class ClassOrder implements Serializable {

    private int coid;
    private String coname;//课程名称
    private Integer conum;//课程编号
    private String coteacher;//代课教练
    private String comembername;//会员名称
    private Integer conumber;//会员账号
    private String cotime; //开课时间



    public ClassOrder(){

    }

    public ClassOrder(Integer conumint ,Integer conumber ) {
        this.conum = conum;
        this.conumber = conumber;

    }

    public ClassOrder(Integer conum,String coname, String coteacher, String comembername, Integer conumber, String cotime) {
        this.conum = conum;
        this.coname = coname;
        this.coteacher = coteacher;
        this.comembername = comembername;
        this.conumber = conumber;
        this.cotime = cotime;
    }

    @Override
    public String toString() {
        return "ClassOrder{" +
                "coid=" + coid +
                ", coname='" + coname + '\'' +
                ", coteacher='" + coteacher + '\'' +
                ", comembername='" + comembername + '\'' +
                ", cotime='" + cotime + '\'' +
                ", conumber=" + conumber +
                '}';
    }

    public int getCoid() {
        return coid;
    }

    public void setCoid(int coid) {
        this.coid = coid;
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname;
    }

    public Integer getConum() {
        return conum;
    }

    public void setConum(Integer conum) {
        this.conum = conum;
    }

    public String getCoteacher() {
        return coteacher;
    }

    public void setCoteacher(String coteacher) {
        this.coteacher = coteacher;
    }

    public String getComembername() {
        return comembername;
    }

    public void setComembername(String comembername) {
        this.comembername = comembername;
    }

    public Integer getConumber() {
        return conumber;
    }

    public void setConumber(Integer conumber) {
        this.conumber = conumber;
    }

    public String getCotime() {
        return cotime;
    }

    public void setCotime(String cotime) {
        this.cotime = cotime;
    }
}
