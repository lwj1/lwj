package com.shana.model;

/**
 * Created by Administrator on 2018/10/22.
 */
public class Recruitment {
    private int id;
    private int resid;
    private int RecruitmentInfoNo;
    private String interviewTime;
    private int readState;
    private int staffNo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRid() {
        return resid;
    }

    public void setRid(int rid) {
        this.resid = rid;
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

    public Recruitment() {

    }
}
