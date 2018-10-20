package com.shana.model;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/19.
 */
public class Resume {
    private int id;
    private int vid;
    private String name;
    private String sex;
    private int age;
    private String nation;
    private String birth;
    private int phone;
    private String email;
    private String marrige;
    private String education;
    private String graduateSchool;
    private String major;
    private String selfassessment;
    private String experience;
    private int salaryExpectation;
    private String jobDesire;


    public Resume() {
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", vid=" + vid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", birth=" + birth +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", marrige=" + marrige +
                ", education='" + education + '\'' +
                ", graduateSchool='" + graduateSchool + '\'' +
                ", major='" + major + '\'' +
                ", selfassessment='" + selfassessment + '\'' +
                ", experience='" + experience + '\'' +
                ", salaryExpectation=" + salaryExpectation +
                ", jobDesire='" + jobDesire + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarrige() {
        return marrige;
    }

    public void setMarrige(String marrige) {
        this.marrige = marrige;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSelfassessment() {
        return selfassessment;
    }

    public void setSelfassessment(String selfassessment) {
        this.selfassessment = selfassessment;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalaryExpectation() {
        return salaryExpectation;
    }

    public void setSalaryExpectation(int salaryExpectation) {
        this.salaryExpectation = salaryExpectation;
    }

    public String getJobDesire() {
        return jobDesire;
    }

    public void setJobDesire(String jobDesire) {
        this.jobDesire = jobDesire;
    }
}
