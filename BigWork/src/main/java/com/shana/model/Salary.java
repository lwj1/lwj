package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/31.
 */
public class Salary implements Serializable{
    private int id;
    private int staffId;
    private double salary;
    private double basicpay;
    private double bonus;
    private double reward;
    private double security;
    private int year;
    private int month;

    public Salary() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBasicpay() {
        return basicpay;
    }

    public void setBasicpay(double basicpay) {
        this.basicpay = basicpay;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getSecurity() {
        return security;
    }

    public void setSecurity(double security) {
        this.security = security;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", staffId=" + staffId +
                ", salary=" + salary +
                ", basicpay=" + basicpay +
                ", bonus=" + bonus +
                ", reward=" + reward +
                ", security=" + security +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
