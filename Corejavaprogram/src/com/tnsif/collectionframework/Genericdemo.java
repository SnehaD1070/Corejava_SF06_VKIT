package com.tnsif.collectionframework;
//demo for generic concepts
import java.util.ArrayList;
import java.util.Iterator;

public class Genericdemo {
	public static void main(String[] args) {
		ArrayList<String> lis=new ArrayList<String>();
		
		lis.add("sneha");
		lis.add("usha");
		lis.add("dinesh");
		lis.add("ruby");
		lis.add("jacky");
		System.out.println(lis);
		
		// iterable interface
		
		// traversing list through Iterator
		
		Iterator itr=lis.iterator();
		while(itr.hasNext()){//check if iterator has a element
			System.out.println(itr.next());//printing the element and move next
		}
		
		
	}

}
