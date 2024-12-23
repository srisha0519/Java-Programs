package com.Vehicle;

public class PCDemo {

	public static void main(String[] args) {
		
        Product product1 = new Product();
        product1.productName = "one plus nord CE4";
        product1.price = 27500.00;

        Customer customer1 = new Customer();
        customer1.customerName = "junnu";
        customer1.customerID = 101;
        
        System.out.println("Product Details:");
        product1.displayProductInfo();

        System.out.println("\nCustomer Details:");
        customer1.displayCustomerInfo();

	}

}
