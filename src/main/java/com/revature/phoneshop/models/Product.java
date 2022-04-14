package com.revature.phoneshop.models;

public class Product {
    private int id;
    private String name;
    private String model;
    private String brand;
    private int price;
    private int warehouse_id;

    public Product() {
    }

    public Product(int id, String name, String model, String brand, int price,int warehouse_id) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.warehouse_id = warehouse_id;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nName: " + name + "\nModel: " + model + "\nPrice: " +  price;
    }


}










