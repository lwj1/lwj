package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/30.
 */
public class Reward implements Serializable{
    private int id;
    private int staffId;
    private int money;
    private String reason;
    private String date;

    @Override
    public String toString() {
        return "Reward{" +
                "id=" + id +
                ", staffId=" + staffId +
                ", money=" + money +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                '}';
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Reward() {

    }
}
