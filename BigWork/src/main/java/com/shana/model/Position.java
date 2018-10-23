package com.shana.model;

/**
 * Created by Administrator on 2018/10/23.
 */
public class Position {
    private int id;
    private int DepNo;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepNo() {
        return DepNo;
    }

    public void setDepNo(int depNo) {
        DepNo = depNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position() {

    }
}
