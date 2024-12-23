package com.Inheritance;

public class Shirt extends Clothing {
    private String material;

    public Shirt(String name, double price, String size, String material) {
        super(name, price, size);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Shirt Name: " + getName());
        System.out.println("Price: Rs" + getPrice());
        System.out.println("Size: " + getSize());
        System.out.println("Brand: " + material);
    }
}

