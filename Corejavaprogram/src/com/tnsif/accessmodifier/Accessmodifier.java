package com.tnsif.accessmodifier;

public class Accessmodifier {
	// public 
	 int a=1;
	String s="Sneha";
	
	public void display() {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		Accessmodifier obj=new Accessmodifier();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}


}
