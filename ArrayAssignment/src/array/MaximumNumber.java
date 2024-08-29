package array;

public class MaximumNumber {

	public  static void main(String[]args) {
		
		int[]arr= {45,67,98,63,59,24,48};
		int n=7;
        int max =arr [0],min=arr[0];
        
        
    for(int i=1;i<n;i++) {
       
            if (arr[i]> max) {
                max = arr[i];
            
            }
            if (arr[i]<min)
                {
        	min=arr[i];
        	
                }
            }
	
        	
                System.out.println("Maximum value in the array: " + max);
                System.out.println("Minimum value in the array: " + min);
    }

}




        
            
        

      

		
		
		
		
	

