package com.exilant.training.day003.composite;

public class CompositeClient {
public static void main(String[] args) {
	Customer customer1= new Customer(101,"Birendra");
	Customer customer2= new Customer(102,"Lohit");
	Customer customer3= new Customer(103,"Ramana");
	Customer customer4= new Customer(104,"Tejaswini");
	Customer customer5= new Customer(105,"Vamsi");
	Customer customer6= new Customer(106,"Uma");
	Customer customer7= new Customer(107,"Kavitha");
	Customer customer8= new Customer(108,"Ravi");
	Customer customer9= new Customer(109,"Akkmahadevi");
	
	
	customer1.addReference(customer9);
	System.out.println(customer1);
	//customer1.removeReference(customer9);
	System.out.println(customer1);
}
}
