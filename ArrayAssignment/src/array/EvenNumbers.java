package array;

public class EvenNumbers {
	
	public static void main(String[]args) {
		
		int[]values= {4,6,7,2,139,5};
		
		int evenSum=0;
		
		for(int num:values) {
			if(num%2==0) {
				evenSum+=num;
			}
		}
		System.out.println("The sum of even numbers in the array:"+evenSum);
	}

}
