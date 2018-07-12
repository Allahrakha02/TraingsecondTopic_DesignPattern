package com.exilant.training.day004.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Male implements FCriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> males= new ArrayList<>();
		
		for(Person temp: persons) {
			if(temp.getSex().equalsIgnoreCase("male")) {
				males.add(temp);
			}
		}
		return males;
	}

}
