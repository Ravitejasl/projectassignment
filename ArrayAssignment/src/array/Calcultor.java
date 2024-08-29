package array;

public class Calcultor {
  

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
	
		
		int c = a + b;
		System.out.println("Enter the sum of valve:" + c);

		c = b / a;
		System.out.println("Enter the division of valve:" + c);

		c = b-a;
		System.out.println("Enter the subs of valve:" + c);
		c = a * b;
		System.out.println("Enter the multi of valve:" + c);
		 ++a;
         System.out.println("++a = " + a);
        
         --a;
         System.out.println("--a=" +a);
         
    
		if (b != 0) {
             c = a / b;
            System.out.println("a / b = " + c);
        } else {
            System.out.println("Division by zero");
        }

        // Modulus
        if (b != 0) {
            c = a % b;
            System.out.println("a % b = " + c);
        } else {
            System.out.println("c");
         
            System.out.println("Exist the loop");  
		
        }
	}
}



    	

        	 
    
        
            
