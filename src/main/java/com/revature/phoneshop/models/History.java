package com.revature.phoneshop.models;

public class History {

    private int id;
    private int phone_id;
    private int user_id;


    public History() {
    }

    public History(int id, int phone_id, int user_id) {
        this.id = id;
        this.phone_id = phone_id;
        this.user_id = user_id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setUser_id(int user_id) { this.user_id = user_id;}

    @Override
    public String toString() {
        return "\nid: " + id + "\nphone_id: " + phone_id + "\nuser_id: " + user_id;
    }
}


