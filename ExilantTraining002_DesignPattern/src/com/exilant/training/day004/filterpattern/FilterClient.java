package com.exilant.training.day004.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterClient {
	public static void main(String[] args) {
		
		List<Person> list= new ArrayList<Person>();
		
		
		list.add(new Person("Lohit","male","single"));		
		list.add(new Person("Ramana","male","single"));
		list.add(new Person("Kumar","male","married"));
		list.add(new Person("Kavita","female","married"));
		list.add(new Person("Subhasree","female","single"));
		list.add(new Person("Jotsna","female","married"));
		list.add(new Person("priya","female","married"));
		list.add(new Person("Vinod","male","married"));
		list.add(new Person("Lohita","female","married"));
		
		FCriteria maleCriteria= new Male();
		FCriteria maleCriteria1= new Married();
		
		/*
		System.out.println("********************* Only married or male");
		maleCriteria.meetCriteria(list).forEach(System.out::println);
		maleCriteria1.meetCriteria(list).forEach(System.out::println);*/
		
		ComparisonCriteria cc= new ComparisonCriteria();
		cc.setCriteria1(maleCriteria);
		cc.setCriteria2(maleCriteria1);
		System.out.println("MAle or Married");
		cc.getCompleteResultOR(list).forEach(System.out::println);
		System.out.println("MAle and Married");
		cc.getCompleteResultAnd(list).forEach(System.out::println);
		
				
	}

}
