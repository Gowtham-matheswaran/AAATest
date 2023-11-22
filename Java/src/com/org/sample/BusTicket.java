 package com.org.sample;

import java.util.Scanner;

public class BusTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int age = sc.nextInt();
		
//		if(5<age) {
//			if(12>=age) {
//				System.out.println("hight");
//				double height  = sc.nextDouble();
//				if(height<=130) {
//					System.out.println("ht");
//				}
//				else {
//					System.out.println("ft");
//				}
//			}else {
//				System.out.println("ft");
//			}
//		}else {
//			System.out.println("nt");
//		}
		if(5>age) {
			System.out.println("nt");
		}
		else if(12>=age&5<age) {
			System.out.println("enter height");
			if(130>=sc.nextDouble()) {
				System.out.println("ht");
			}else {
				System.out.println("ft");
			}	
		}
		else if(12<age) {
			System.out.println("ft");
		}
		
		
		
		
		
		
		
		
		
	}
}
