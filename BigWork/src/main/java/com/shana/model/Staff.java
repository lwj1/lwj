package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/22.
 */
public class Staff implements Serializable{
    private int id;
    private int depId;
    private int posId;
    private String name;
    private String pass;
    private String sex;
    private double salary;
    private int age;
    private long phone;
    private String email;
    private String name2;
    private int status;
    private String posName;
    private String depName;
    private int status2;

    public int getStatus2() {
        return status2;
    }

    public void setStatus2(int status2) {
        this.status2 = status2;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }



    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Staff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getPosId() {
        return posId;
    }

    public void setPosId(int posId) {
        this.posId = posId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", depId=" + depId +
                ", posId=" + posId +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", name2='" + name2 + '\'' +
                ", status=" + status +
                ", posName='" + posName + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }
}
