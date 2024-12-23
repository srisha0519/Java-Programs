package com.Inheritance;
public abstract class Clothing {
    private String name;
    private double price;
    private String size;
    public Clothing(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getSize() {
        return size;
    }
    public abstract void displayDetails();
}

