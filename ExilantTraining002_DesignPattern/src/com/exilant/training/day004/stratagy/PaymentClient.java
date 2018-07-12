package com.exilant.training.day004.stratagy;

import java.util.Arrays;
import java.util.List;

public class PaymentClient {
	
	public static void main(String[] args) {
		
		
		List<Item> items= Arrays.asList(
				new Item("Items "+101, 500, 2),
				new Item("Items "+102, 1500, 1),
				new Item("Items "+103, 5100, 12),
				new Item("Items "+104, 5001, 20),
				new Item("Items "+105, 5020, 21)
				);
		
		
		Payment payment= new CreditCard("hdfc",""+12012, ""+1245, "1454545", 10.0, "hdfc");
		
		ShoppingCart shoping= new ShoppingCart(items);
		/*
		* shoping.addItem(new Item("Items "+101, 500, 2));
		* shoping.addItem(new Item("Items "+102, 1500, 1));
		
		* shoping.addItem(new Item("Items "+103, 5100, 12));
		*/
		shoping.modify("Items 101", new Item("Items 101", 250, 3));
		
		shoping.checkOut(payment);
		payment.pay(shoping.calculateTotal());
		System.out.println(items);
		
	}

}
