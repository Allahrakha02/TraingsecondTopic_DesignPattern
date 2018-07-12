package com.exilant.training.day004.servicelocator;

public class ServiceLocator {

	public static Cache cache;
	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName) {
		Service service = cache.getService(jndiName);
		if (service != null) {
			return service;
		}
	InitialContext context = new InitialContext();
		Service myService = (Service) context.lookuo(jndiName);
		cache.addService(myService);
		return myService;
	}
}
