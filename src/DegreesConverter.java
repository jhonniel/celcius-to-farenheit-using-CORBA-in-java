import java.util.Scanner;

public class DegreesConverter {
	
	public static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("* Degrees Converter Apps *");
		System.out.println("*************************");
		System.out.println();
		System.out.println("what do you want today? ");
		System.out.println("1- Fahrenheit to Celcius");
		System.out.println("2 - Celcius to Fahrenheit ");
		int choice = getChoice();
		if(choice == 1) {
			System.out.print(getCelcius(getInput()));
		}
		else {
			System.out.print(getFahrenheit(getInput()));
		}
	}

	public static String getCelcius(double input) {
		   double convert = 5/9.0*(input-32);
		   return "RESULT: The Celcius of the input Fahrenheit: "+convert;
	}
	public static String getFahrenheit(double input) {
		   double convert = 9/5.0*input+32;
		   return "RESULT: The Fahrenheit of the input Celcius: "+convert;
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
