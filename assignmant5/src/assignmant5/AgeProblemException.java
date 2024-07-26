package assignmant5;

public class AgeProblemException extends Exception {

	public AgeProblemException(String string) {
		// TODO Auto-generated constructor stub
	}


	static void validate(int age) throws AgeProblemException {
		if (age < 18) {

			throw new AgeProblemException("age is not valid to vote");
		}else {
			System.out.println("Welcome to vote");
		}
	
	}
	// main method
	public static void main(String []args){  
    {  
        try  
        {  
            // calling the method   
            validate(19);  
        }  
        catch (AgeProblemException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}
	}	
