package com.fusion;

public class UppserCase {
	
	public static void main(String[]args) {
		
		String str="Hello";
		
		System.out.println("Output:"+str.toLowerCase());
		System.out.println("Output:"+str.toUpperCase());
		
		System.out.println("Output:"+str.substring(0,1).toLowerCase() + str.substring(1).toUpperCase());
		
	}

}
