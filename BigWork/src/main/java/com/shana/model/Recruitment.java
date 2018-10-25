package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/22.
 */
public class Recruitment implements Serializable{
    private int id;
    private int resid;
    private int recruitmentInfoNo;
    private String interviewTime;
    private int readState;
    private int staffNo;
    private String posname;
    private String staffName;
    private int comfirm;
    private int employ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    public int getRecruitmentInfoNo() {
        return recruitmentInfoNo;
    }

    public void setRecruitmentInfoNo(int recruitmentInfoNo) {
        this.recruitmentInfoNo = recruitmentInfoNo;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public int getReadState() {
        return readState;
    }

    public void setReadState(int readState) {
        this.readState = readState;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getComfirm() {
        return comfirm;
    }

    public void setComfirm(int comfirm) {
        this.comfirm = comfirm;
    }

    public int getEmploy() {
        return employ;
    }

    public void setEmploy(int employ) {
        this.employ = employ;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", resid=" + resid +
                ", recruitmentInfoNo=" + recruitmentInfoNo +
                ", interviewTime='" + interviewTime + '\'' +
                ", readState=" + readState +
                ", staffNo=" + staffNo +
                ", posname='" + posname + '\'' +
                ", staffName='" + staffName + '\'' +
                ", comfirm=" + comfirm +
                ", employ=" + employ +
                '}';
    }

    public Recruitment() {

    }
}
