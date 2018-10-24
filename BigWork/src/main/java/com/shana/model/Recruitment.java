package com.shana.model;

/**
 * Created by Administrator on 2018/10/22.
 */
public class Recruitment {
    private int id;
    private int resid;
    private int recruitmentInfoNo;
    private String interviewTime;
    private int readState;
    private int staffNo;
    private String posname;
    private String staffName;
    private int comfire;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

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

    public int getComfire() {
        return comfire;
    }

    public void setComfire(int comfire) {
        this.comfire = comfire;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", resid=" + resid +
                ", RecruitmentInfoNo=" + recruitmentInfoNo +
                ", interviewTime='" + interviewTime + '\'' +
                ", readState=" + readState +
                ", staffNo=" + staffNo +
                ", posname='" + posname + '\'' +
                ", staffName='" + staffName + '\'' +
                ", comfire=" + comfire +
                '}';
    }

    public Recruitment() {

    }
}
