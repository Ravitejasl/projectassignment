package assignmant5;

import java.util.Scanner;

public class VowelException  {
	public static void main(String[]args) {
		Demo d=new Demo();
		d.input();
	}
}
class Demo{
	void input() {
	 
	Scanner sc= new Scanner(System.in); 
	
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();
	try {
		Demo.containVowel(str);
	}catch(Exception ve) {
		System.out.println(ve.getMessage());
	}
		
	}
	static void containVowel (String str) throws Exception{
		String vowels ="AEIOUaeiou";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
			Assign ve=new Assign();
			throw ve;
		}
		
	System.out.println("  string does not contain vowels. ");             
	}  
}
class Assign extends Exception {

	public String getMessage()  {
		return"Given string contain  vowel!!!";
		
	}
}





