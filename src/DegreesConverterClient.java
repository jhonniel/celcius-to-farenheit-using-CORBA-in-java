import org.omg.CosNaming.*;
import java.util.*;
import org.ong.CORBA.*;
public class DegreesConverterClient {
	
	public static Scanner sc = null;
	
	public static void main(String[] args) {
       try {
    	   sc = new Scanner(System.in);
    	   
    	   // create and initialize the ORB
    	   ORB orb = ORB.init(args, null);
    	   
    	   //get the root naming context
    	   org.omg.CORBA.Object objRef = orb.resolve_initial_references ("NameService");
    	   // Use NamingContextExt instead of NamingContext. This is
    	   // part of the Interoperable naming Service.
    	   NamingContextExt ncRef NamingContextExtlelper.narrow(objRef);
    	   
    	   //find java file
    	   Degrees DegObj = (Degrees) DegreesAppHlelper.narrow(ncRef.resolve_str("ABC"));
    	   //getting in error in getCelcius and get fahrenheit it need to define so that it can resolve
    	   
    	   //Actual for Client
    		System.out.println("*************************");
    		System.out.println("* Degrees Converter Apps *");
    		System.out.println("*************************");
    		System.out.println();
    		System.out.println("what do you want today? ");
    		System.out.println("1- Fahrenheit to Celcius");
    		System.out.println("2 - Celcius to Fahrenheit ");
    		int choice = getChoice();
    		if(choice == 1) {
    			System.out.print(DegObj.getCelcius(getInput()));
    		}
    		else {
    			System.out.print(DegObj.getFahrenheit(getInput()));
    		}

       }catch (Exception e){
       
       }
      
	}
	public static int getChoice() {
		try {
			System.out.print("Enter Choice: ");
			int input = sc.nextInt();
			if(input < 1 || input >2) throw new Exception();
			return input;
			
		}catch (Exception e) {
			System.err.println("Error: Please choose between 1 and 2 only.");
			return getChoice();
			
		}
	}

	public static double getInput() {
		try {
			System.out.print("Enter a number: ");
			double input =sc.nextDouble();
			if(input < 0) throw new Exception();
			return input;
		}catch (Exception e) {
			System.err.println("Error: Please choose between 1 and 2 only");
			return getInput();
		}
	}
}