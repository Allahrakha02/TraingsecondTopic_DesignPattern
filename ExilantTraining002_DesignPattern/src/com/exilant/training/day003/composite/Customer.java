package com.exilant.training.day003.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private List<Customer> reference= new ArrayList<Customer>();
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Customer> getReference() {
		return reference;
	}
	public void setReference(List<Customer> reference) {
		this.reference = reference;
	}
	
	
	
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.reference = reference;
	}
	public void addReference(Customer customer) {
		this.reference.add(customer);
	}
	public void removeReference(Customer customer) {
		this.reference.remove(customer);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
	
	
}
