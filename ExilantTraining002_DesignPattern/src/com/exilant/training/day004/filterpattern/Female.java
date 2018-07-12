package com.exilant.training.day004.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class Female implements FCriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> females = new ArrayList<>();

		for (Person temp : persons) {
			if (temp.getSex().equalsIgnoreCase("female")) {
				females.add(temp);
			}
		}
		return females;
	}
}
