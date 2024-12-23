package com.Inheritance;

import java.util.Scanner;

public class onlineShoppingStore {
	public static void main(String[] args) {
		System.out.println("Welcome to Myntra");
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true) {
		System.out.println("1.clothing\n2.grogeries\n3.footwear\n4.electronic devices\n5.exit");
		choice=sc.nextInt();
		int option;
		switch(choice) {
		case 1:
			System.out.println("1.shirts\n2.pants");
			option=sc.nextInt();
			break;
		case 2:
			System.out.println("1.fruits\n2.vegs");
			option=sc.nextInt();
			break;
		case 3:
			System.out.println("1.slippers\n2.sneakers");
			option=sc.nextInt();
			break;
		case 4:
			System.out.println("1.laptops\n2.mobiles");
			option=sc.nextInt();
			break;
		case 5:
			System.out.println("Thankyou");
			System.exit(0);
			break;
		default:
            System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
    /*private ShoppingItem head;
    public onlineShoppingStore() {
    }
    public void addClothingItem(Clothing clothing) {
        ShoppingItem item = new ShoppingItem(clothing);

        if (head == null) {
            head = item;
        } else {
        	ShoppingItem si = head;

            while (si.getNext() != null) {
                si = si.getNext();
            }

            si.setNext(item);
        }
    }

    public void displayClothingItems() {
    	ShoppingItem si = head;

        while (si != null) {
            si.getClothing().displayDetails();
            System.out.println();
            si = si.getNext();
        }
    }

    public static void main(String[] args) {
    	onlineShoppingStore store = new onlineShoppingStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("Welcome to Myntra");
        	System.out.println("1. products");
        	System.out.println("2. Add Item");
            System.out.println("3. Display Clothing Items");
            System.out.println("4. Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	addProduct(store, scanner);
                	 
                break;
                case 2:
                    addClothingItem(store, scanner);
                   
                    break;
                case 3:
                    store.displayClothingItems();
                   
                    break;
                case 4:
                    System.out.println("Your payment is successful");
                    
                    break;
                case 5 : 
                	System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct(onlineShoppingStore store, Scanner scanner) {
    	System.out.println("Select your product(1 for Clothing,2 for Groceries,3 for Sneakers)");
    	int type=scanner.nextInt();
		if (type == 1) {
    		System.out.print("Clothing ");
            String name = scanner.next();
        }
		else if(type==2) {
			 System.out.print("Groceries");
        String thing = scanner.next();
		}
        else {
        	System.out.print("Sneakers");
        String shoe = scanner.next();
	}
    }
	private static void addClothingItem(onlineShoppingStore store, Scanner scanner) {
        System.out.print("Enter clothing item type (1 for Shirt, 2 for Pant): ");
        int type = scanner.nextInt();

        if (type == 1) {
            System.out.print("Enter shirt name: ");
            String name = scanner.next();
            System.out.print("Enter shirt price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter shirt size: ");
            String size = scanner.next();
            System.out.print("Enter shirt material: ");
            String material = scanner.next();
            Shirt shirt = new Shirt(name, price, size, material);
            store.addClothingItem(shirt);
        } else if (type == 2) {
            System.out.print("Enter pant name: ");
            String name = scanner.next();
            System.out.print("Enter pant price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter pant size: ");
            String size = scanner.next();
            System.out.print("Enter pant style: ");
            String style = scanner.next();
            Pant pant = new Pant(name, price, size, style);
            store.addClothingItem(pant);
        }
            else if(type==3) {
            	System.out.print("Select you payment method");
                double prize=scanner.nextDouble();
            }

        }*/
    
