package com.exilant.training.day003.singleton;

import java.io.Serializable;

//says there should be only one object
//to do so we will have the veriable as static so that you have only
//one reference, in single ton we can have two types
//1.eager single ton
//2. lazy single ton
//(cons for eager singleton ) either the instance is needed or not
// one copy is alredy kept in jvm
public class SingleTon implements Serializable {
	public static final SingleTon instance= new SingleTon();
	
	//shall have the private constructor so that, it is not accessable
	//
	private SingleTon() {
		System.out.println("single ton private Constructor is called...");
	}
	public static SingleTon getInstance() {
		
		return instance;
	}
	
	//to stop creating an instance if alredy is exists
	//break the Reflection

}
