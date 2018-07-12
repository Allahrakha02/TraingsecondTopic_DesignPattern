package com.exilant.training.day004.stratagy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	public ShoppingCart() {
		this.items= new ArrayList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void addItemList(List<Item> items) {
		
		for(Item item:items) {
		this.items.add(item);
		}
	}
	
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public ShoppingCart(List<Item> items) {
		super();
		this.items = items;
	}

	public int calculateTotal() {
		int sum=0;
		for(Item item:items) {
			sum=item.getPrice()*item.getQty();
		}
		return sum;
	}
	public void checkOut(Payment paymentStrategy) {
		
		paymentStrategy.pay(calculateTotal());
	}
	
	public void modify(String itemName,Item itemNo) {
		int i=0;
		//List<Item> itemsd= new ArrayList<Item>();
		for(Item item:this.items) {
			if(itemName.equalsIgnoreCase(item.getItemCode())) {
				items.set(i,itemNo);
			i++;
			}
			i++;
		}
		//items = items;
		
	}

}
