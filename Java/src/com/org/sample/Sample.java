package com.org.sample;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("Enter the value");
		//		int a = sc.nextInt();
		//
		//		if(a>0){
		//			System.err.println("Number Positive");
		//		}
		//		else if(a<0){
		//			System.out.println("Number Negativie");
		//		}
		//
		//		else{
		//			System.out.println("Number Zero ");
		//		}
		String s="hello" ;
		String s1="HellO";
		StringBuffer sb = new StringBuffer(s);
		StringBuilder sbi = new StringBuilder(s);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		StringBuilder append = sbi.append("jzjcv");
		System.out.println(append);
		System.out.println(s.equals(s1));
		boolean equ = s.equalsIgnoreCase(s1);
		System.out.println(equ);

		//		String str="WeLCOMe java $";
		//		int caseCount = 0;
		//        for (int i = 0; i < str.length(); i++) {
		//            if (Character.isAlphabetic(str.charAt(i))) {
		//                caseCount++;
		//            }
		//        }
		//
		//        System.out.println("Lowecase count: " + caseCount);
		//    }



	}
}
