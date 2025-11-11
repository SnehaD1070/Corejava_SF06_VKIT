package com.tnsif.collectionframework;
import java.util.ArrayList;
import java.util.Collections;
public class Comparabledemo {
	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<>();
		p.add(new Person("john", 30));
		p.add(new Person("pranav", 10));
		p.add(new Person("riya", 20));
		p.add(new Person("nisha", 32));
		p.add(new Person("johnny", 34));
		
		Collections.sort(p);
		for(Person pr:p) {
			pr.displayinfo();
		}

		
	}

}
