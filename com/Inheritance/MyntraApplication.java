package com.Inheritance;

import java.util.Scanner;
public class MyntraApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("Welcome to Myntra!");
        do {
            System.out.println("WELCOME TO MYNTRA:");
            System.out.println("1: Product Details");
            System.out.println("2: Cost");
            System.out.println("3: Add to Cart");
            System.out.println("4: Payment");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            // SELECT YOUR CHOICE
            switch (choice) {
                case 1:
                    displayProductDetails();
                    break;
                case 2:
                    showProductParticularsAndCost();
                    break;
                case 3:
                	addCart();
                	break;
                case 4:
                    processPayment();
                    break;
                case 5:
                    System.out.println("Thank you for visiting Myntra! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
    //  product details
    private static void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("1. Cloths - Stylish and comfortable");
        System.out.println("2. Groceries - Fresh and clean");
        System.out.println("3. Sneakers - Lightweight and versatile");
    }
    //  cost
    private static void showProductParticularsAndCost() {
        System.out.println("\nProduct Particulars and Costs:");
        System.out.println("1. Cloths: Starts from 499");
        System.out.println("2. Groceries: Starts from 9");
        System.out.println("3. Sneakers: Starts from 799");
    }
    //cart
    private static void addCart() {
        System.out.println("\n Number of products:");
        System.out.println("\n Total cost:");
    }
    //  payment
    private static void processPayment() {
        System.out.println("\nPayment Options:");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Net Banking");
        System.out.println("3. UPI");
        System.out.println("4. Cash on Delivery");
        System.out.println("Payment Successful! Thank you for shopping.");
    }
}
