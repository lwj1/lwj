package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/23.
 */
public class Position implements Serializable{
    private int id;
    private int DepNo;
    private String name;
    private String depName;

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

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Position() {

    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", DepNo=" + DepNo +
                ", name='" + name + '\'' +
                ", DepName='" + depName + '\'' +
                '}';
    }
}
