package com.shana.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/30.
 */
public class Training implements Serializable{
    private int id;
    private String name;
    private String message;
    private String duration;
    private String address;

    public Training() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", duration='" + duration + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
