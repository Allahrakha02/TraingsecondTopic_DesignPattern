package com.exilant.training.day004.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Married implements FCriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> marrieds= new ArrayList<>();
		
		for(Person temp: persons) {
			if(temp.getMatrialStatus().equalsIgnoreCase("married")) {
				marrieds.add(temp);
			}
		}
		return marrieds;
	}

}