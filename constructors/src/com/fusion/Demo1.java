package com.fusion;

public class Demo1 {
	
	public static void main(String[]rags) {
		
		String str="Pune is the best city";
		System.out.println(str.replace(" ","" ).toLowerCase());
		
		int vowelcount=0, consonantcount=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				vowelcount++;
			}
				
				else if(ch>='a' && ch<='z'){
					
					consonantcount++;
				}
			}
		
		System.out.println("Vowels:"+vowelcount);
		System.out.println("consonants:"+consonantcount);
		}
	}


