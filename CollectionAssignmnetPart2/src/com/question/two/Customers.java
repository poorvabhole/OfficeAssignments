package com.question.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Customers {

	public static void main(String[] args) {
		String input[] = {
				"Rajan Patil, Aundh, 1, Phone Cover, Rs 170, Cash",
				"Mohit Gupta, Baner, 1, Samsung Battery, Rs 900, Credit Card",
				"Rajan Patil, Aundh, 3, Samsung Battery, Rs 1000, Cash",
				"Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card",
				"T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card",
				"Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card",
				"Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card",
				"Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI",
				"Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash",
				"Nina Kothari, Baner, 24, USB Cable, Rs 200, UP"
		};

		
		List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
		
		for(int i=0; i < input.length; i++) {
			String currentInput = input[i];
			String[] currentInputArray = currentInput.split(",");
			CustomerDetails customerDetails = new CustomerDetails();
			
			customerDetails.setCustomerName(currentInputArray[0]);
			customerDetails.setStoreLocation(currentInputArray[1]);
			customerDetails.setDate(currentInputArray[2]);
			customerDetails.setProductName(currentInputArray[3]);
			customerDetails.setPrice(currentInputArray[4]);
			customerDetails.setPaymentType(currentInputArray[5]);
			
			customerDetailsList.add(customerDetails);
		}
		Set<String> product = new TreeSet<String>();
		
		for(CustomerDetails details : customerDetailsList) {
			product.add(details.getProductName());
		}
		List<String> productList= new ArrayList<String>(product);

		String[] priceArray = new String[input.length];
		
		for(int i=0; i<input.length; i++) {
			String productName = productList.get(i);
			for(CustomerDetails details : customerDetailsList) {
				if( productName == details.getProductName())	{
					String value = details.getPrice();
					priceArray[i] = value;
				}
			}
		}
		for(int i=0; i<priceArray.length; i++) {
			System.out.println(priceArray);
		}
		
		

	}

}
