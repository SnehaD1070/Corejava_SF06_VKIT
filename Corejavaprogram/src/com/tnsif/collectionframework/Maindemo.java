package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maindemo {
	public static void main(String[] args) {
		List<Person1> p=new ArrayList<>();
		p.add(new Person1("john", 30));
		p.add(new Person1("pranav", 10));
		p.add(new Person1("riya", 20));
		p.add(new Person1("nisha", 32));
		p.add(new Person1("johnny", 34));

		//sort by name
		Collections.sort(p,new Sortbyname());
		System.out.println("sorted by name");
		for(Person1 p2:p) {
			p2.display();
		}
		
		//sort by age
		Collections.sort(p,new Sortbyage());
		System.out.println("sorted by age");
		for(Person1 p2:p) {
			p2.display();
		}
	}
}
