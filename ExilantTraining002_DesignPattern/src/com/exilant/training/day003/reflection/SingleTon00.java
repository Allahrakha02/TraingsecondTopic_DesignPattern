package com.exilant.training.day003.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.exilant.training.day003.singleton.SingleTon;

public class SingleTon00 {
	
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
	SingleTon singleton=SingleTon.getInstance();
	SingleTon singleton1=null;
	SingleTon singleton2=null;
	
	System.out.println("Single to n 1   "+singleton);
	System.out.println("Single to n 1  "+singleton1);
	System.out.println("Single to n 2   "+singleton2);
	
	Constructor []constructors=
			SingleTon.class.getDeclaredConstructors();
	for(Constructor cons: constructors) {
		cons.setAccessible(true);
		singleton1=(SingleTon) cons.newInstance();
		singleton2=(SingleTon) cons.newInstance();
		break;
	}
	System.out.println();
	System.out.println();
	System.out.println("Single to n 1   "+singleton);
	System.out.println("Single to n 1  "+singleton1);
	System.out.println("Single to n 2   "+singleton2);
}

}
