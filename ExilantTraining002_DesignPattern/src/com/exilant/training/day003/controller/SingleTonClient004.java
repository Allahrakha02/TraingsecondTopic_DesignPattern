package com.exilant.training.day003.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.exilant.training.day003.singleton.SingleTon;

public class SingleTonClient004 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SingleTon singleton=SingleTon.getInstance();
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("Sample.ser"));
		out.writeObject(singleton);
		
		System.out.println("Object Saved with hashCode "+singleton);
		
		out.close();
		
		ObjectInputStream ois= new  ObjectInputStream(new FileInputStream("Sample.ser"));
		SingleTon singleton2=(SingleTon) ois.readObject();
		ois.close();

		System.out.println("Object Saved with hashCode "+singleton2);
		
	}
}
