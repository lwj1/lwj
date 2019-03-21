package com.shana.model;

/**
 * Created by Administrator on 2018/11/2.
 */
public class Reconsideration {
    private int id;
    private int rewid;
    private String reason;
    private int statu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRewid() {
        return rewid;
    }

    public void setRewid(int rewid) {
        this.rewid = rewid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public Reconsideration() {

    }
}
