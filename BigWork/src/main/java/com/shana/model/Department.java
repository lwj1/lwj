package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/20.
 */
public class Department implements Serializable{
    private int id;
    private int empno;
    private int posno;
    private String name;
    private String starttime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getPosno() {
        return posno;
    }

    public void setPosno(int posno) {
        this.posno = posno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public Department() {

    }
}
