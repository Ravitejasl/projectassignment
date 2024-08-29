package array;

import java.util.Scanner;

public class Marks {
	
	public void userString() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		
		int sizeofArr=sc.nextInt();
		System.out.println("String size:"+sizeofArr);
		String[] names= new String[sizeofArr];
		
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter the place"+(i+1)+":");
			names[i]=sc.next();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println("Names of places"+(i+1)+":"+names[i]);
		}
		System.out.println("......");
		
		for(String element:names)
		{
			System.out.println("Names of places:"+element);
		
		sc.close();
		}
	}
	
	public static void main(String[] args) {
		{
			
			Marks obj=new Marks();
			obj.userString();
					
					
		}
		// TODO Auto-generated method stub

	}

}
