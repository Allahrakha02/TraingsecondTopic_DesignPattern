package com.exilant.training.day004.servicelocator;

import java.util.ArrayList;
import java.util.List;


public class Cache {

	private List<Service> services;
	
	public Cache() {
		services= new ArrayList<Service>();
	}
	
	public Service getService(String serviceName) {
		for(Service service:services) {
			System.out.println("Current Service "+service.getName());
			if(service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning Cached Service :"+serviceName+"object ");
				return service;
			}
		}
		return null;
		
	}
	
	public void addService(Service myService) {
		boolean exists=false;
		for(Service service:services) {
			if(service.getName().equalsIgnoreCase(myService.getName())) {
				exists=true;
			}
		}
		if(!exists) {
			services.add(myService);
		}
		
	}
}
