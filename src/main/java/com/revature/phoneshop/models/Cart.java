package com.revature.phoneshop.models;

public class Cart {

    private int id;
    private int phone_id;
    private int history_id;


    public Cart() {
    }

    public Cart(int id, int phone_id, int history_id) {
        this.id = id;
        this.phone_id = phone_id;
        this.history_id = history_id;

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

    public void setPhone_id(int phone_id) {this.phone_id = phone_id;}

    public int gethistory_id() {
        return history_id;
    }

    public void sethistory_id(int history_id) {this.history_id = history_id; }


    }

