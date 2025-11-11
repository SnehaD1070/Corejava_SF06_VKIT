package com.tnsif.collectionframework;
import java.util.LinkedList;
import java.util.List;


public class LinkedListdemo {
	public static void main(String[] args) {
		
		List<String> frt=new LinkedList<>();
		frt.add("apple"); //add element
		frt.add("mango");
		frt.add("cherry");
		
		System.out.println("first element "+frt.get(0));
		
		frt.set(1, "dragonfruit"); //modify data
		frt.remove(0); //remove element
		System.out.println(frt);
		
		if(frt.contains("apple")) {
				System.out.println("apple is in frt");
		}
		for(String fruit : frt) {
			System.out.println(fruit);
		}
	}

}
