package array;



public class Sumofvalues {
	
	public static void main(String[]args) {
		
		int[]numbers= {10,20,30,40};
		
		int sum=0;
		double average;
		
		for(int elements:numbers) {
			sum +=elements;
			
		}
		average=(double)sum/numbers.length;
		
		System.out.println("Sum of array values:"+sum);
		System.out.println("Average of arrays:"+average);
		
	}

}