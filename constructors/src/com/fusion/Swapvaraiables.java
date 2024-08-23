package com.fusion;

public class Swapvaraiables {
	
	public static void main(String[]args) {
		
		String s1="HELLO";
		String s2="WORLD";
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		String s3=s1;  // s3=HELLO
		s1=s2;         // s1=WORLD
		s2=s3;         //s2=HELLO 
		
		System.out.println("Output:");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}

}
