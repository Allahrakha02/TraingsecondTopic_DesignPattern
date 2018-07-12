
package com.exilant.training.day004.stratagy;

public class Item {

	private String itemCode;
	private int price;
	private int qty;
	public Item(String itemCode, int price, int qty) {
		super();
		this.itemCode = itemCode;
		this.price = price;
		this.qty = qty;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	
	
}
