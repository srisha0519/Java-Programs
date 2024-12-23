package com.Inheritance;

public class Pant extends Clothing {
    private String style;

    public Pant(String name, double price, String size, String style) {
        super(name, price, size);
        this.style = style;
    }
    public void displayDetails() {
        System.out.println("Pant Name: " + getName());
        System.out.println("Price: Rs" + getPrice());
        System.out.println("Size: " + getSize());
        System.out.println("Style: " + style);
    }
}

