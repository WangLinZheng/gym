package com.gym.pojo;

import java.io.Serializable;

/**
 * 会员实体类
 */
public class Member implements Serializable {

    private Integer mid;
    private Integer mnumber;
    private String mpwd;
    private String mname;
    private String mgender;
    private Integer mage;
    private Integer mheight;
    private Integer mweight;
    private Integer mphone;
    private Integer cardid;
    private String cardtime;
    private Integer cardclass;
    private  Integer nextclass;

    @Override
    public String toString() {
        return "Member{" +
                "mid=" + mid +
                ", mnumber=" + mnumber +
                ", mpwd='" + mpwd + '\'' +
                ", mname='" + mname + '\'' +
                ", mgender='" + mgender + '\'' +
                ", mage=" + mage +
                ", mheight=" + mheight +
                ", mweight=" + mweight +
                ", mphone=" + mphone +
                ", cardid=" + cardid +
                ", cardtime='" + cardtime + '\'' +
                ", cardclass=" + cardclass +
                ", nextclass=" + nextclass +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMnumber() {
        return mnumber;
    }

    public void setMnumber(Integer mnumber) {
        this.mnumber = mnumber;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public Integer getMage() {
        return mage;
    }

    public void setMage(Integer mage) {
        this.mage = mage;
    }

    public Integer getMheight() {
        return mheight;
    }

    public void setMheight(Integer mheight) {
        this.mheight = mheight;
    }

    public Integer getMweight() {
        return mweight;
    }

    public void setMweight(Integer mweight) {
        this.mweight = mweight;
    }

    public Integer getMphone() {
        return mphone;
    }

    public void setMphone(Integer mphone) {
        this.mphone = mphone;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public String getCardtime() {
        return cardtime;
    }

    public void setCardtime(String cardtime) {
        this.cardtime = cardtime;
    }

    public Integer getCardclass() {
        return cardclass;
    }

    public void setCardclass(Integer cardclass) {
        this.cardclass = cardclass;
    }

    public Integer getNextclass() {
        return nextclass;
    }

    public void setNextclass(Integer nextclass) {
        this.nextclass = nextclass;
    }
}
