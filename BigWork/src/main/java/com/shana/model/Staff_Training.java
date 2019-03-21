package com.shana.model;

/**
 * Created by Administrator on 2018/11/2.
 */
public class Staff_Training {
    int id;
    int staffId;
    int traId;
    int status;

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

    public int getTraId() {
        return traId;
    }

    public void setTraId(int traId) {
        this.traId = traId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Staff_Training() {

    }
}
