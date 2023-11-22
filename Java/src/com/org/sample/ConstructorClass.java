package com.org.sample;

public class ConstructorClass {

	public ConstructorClass() {
		System.out.println("GOWTHAM");
	}//Constructor
	
	public void keep() {
		System.out.println("keeping");
	}//Normal Method

	public static void cricket() {
		System.out.println("Gowtham is a all rounder");
	}//Static Method
	
	public static void main(String[] args) {
		ConstructorClass obj=new ConstructorClass();
		obj.keep();
		cricket();
	}
}
