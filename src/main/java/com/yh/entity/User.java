package com.yh.entity;

public class User {
    private String id;
    private String name;
    private String gender;
    private String address ;
    private String mark;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getMark() {
        return mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

