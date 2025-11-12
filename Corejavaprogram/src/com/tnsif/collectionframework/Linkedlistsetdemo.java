package com.tnsif.collectionframework;

import java.util.LinkedHashSet;

public class Linkedlistsetdemo {
	public static void main(String[] args) {
	LinkedHashSet<String> s=new LinkedHashSet<>();
	
	s.add("cheery");
	s.add("banana");
	s.add("orange");
	s.add("cheery");
	s.add("papaya");
	s.add("cheery");
	s.add(null);
	s.add(null);
	
	System.out.println("linked hashset "+s);

	}

}
