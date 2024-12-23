package com.Inheritance;

public class ShoppingItem {
    private Clothing clothing;
    private ShoppingItem next;

    public ShoppingItem(Clothing clothing) {
        this.clothing = clothing;
        this.next = null;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public ShoppingItem getNext() {
        return next;
    }

    public void setNext(ShoppingItem next) {
        this.next = next;
    }
}

