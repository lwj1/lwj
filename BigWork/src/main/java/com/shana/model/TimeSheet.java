package com.shana.model;

/**
 * Created by Administrator on 2018/11/1.
 */
public class TimeSheet {
    private int id;
    private int staffId;
    private String starttime;
    private String endtime;
    private String status;

    @Override
    public String toString() {
        return "TimeSheet{" +
                "id=" + id +
                ", staffId=" + staffId +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public TimeSheet() {
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
