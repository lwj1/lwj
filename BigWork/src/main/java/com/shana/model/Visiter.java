package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/19.
 */
public class Visiter implements Serializable{
    private int id;
    private String name;
    private String pass;
    private int interview;

    public Visiter() {
    }

    public Visiter(String name) {
        this.name = name;
    }

    public Visiter(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getInterview() {
        return interview;
    }

    public void setInterview(int interview) {
        this.interview = interview;
    }
}
