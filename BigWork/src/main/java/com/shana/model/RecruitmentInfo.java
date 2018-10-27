package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/22.
 */
public class RecruitmentInfo implements Serializable{
    private int id;
    private int posId;
    private String jobAddress;
    private String educationRequire;
    private String experienceRequire;
    private String sexRequire;
    private String jobFunction;
    private int number;
    private String ageRequire;
    private String posName;

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        this.posId = posId;
    }

    public String getExperienceRequire() {
        return experienceRequire;
    }

    public void setExperienceRequire(String experienceRequire) {
        this.experienceRequire = experienceRequire;
    }






    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }


    public String getEducationRequire() {
        return educationRequire;
    }

    public void setEducationRequire(String educationRequire) {
        this.educationRequire = educationRequire;
    }

    public String getSexRequire() {
        return sexRequire;
    }

    public void setSexRequire(String sexRequire) {
        this.sexRequire = sexRequire;
    }

    public String getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgeRequire() {
        return ageRequire;
    }

    public void setAgeRequire(String ageRequire) {
        this.ageRequire = ageRequire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RecruitmentInfo() {
    }

    @Override
    public String toString() {
        return "RecruitmentInfo{" +
                "id=" + id +
                ", posId=" + posId +
                ", jobAddress='" + jobAddress + '\'' +
                ", educationRequire='" + educationRequire + '\'' +
                ", experienceRequire='" + experienceRequire + '\'' +
                ", sexRequire='" + sexRequire + '\'' +
                ", jobFunction='" + jobFunction + '\'' +
                ", number=" + number +
                ", ageRequire='" + ageRequire + '\'' +
                ", posName='" + posName + '\'' +
                '}';
    }
}
