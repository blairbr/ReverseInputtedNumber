import java.util.Scanner;

public class ReversedNumber {

	   public static void main(String[] args) {
	
		   	//Create scanner so we can read user input
		   Scanner scanner = new Scanner(System.in);
		       
		       //Ask user for input
		       System.out.print("Type a number and press enter: ");
		       
		       //Assign user's input to the variable 'input'
		       int input = scanner.nextInt();
		       
		       //Create variables to be used in while loop
		       
		       int remainder;
		       int reverse = 0;
		       
		       //Loop executes as long as the value is greater than zero
		       while(input > 0) {
		    	
		       //Divides the user's number by ten and saves the remainder as variable 'remainder'
		       remainder = input % 10;
		       
		       //Multiplies 'reverse' by ten, adds remainder and stores value back as 'reverse'
		       reverse = reverse * 10 + remainder;
		       
		       //Removes the ones place digit from user's input
		       input = input /10;
		       
		       }
		       
		       //Print out the reversed number
		       System.out.println("This number reversed is " + reverse + ".");   
		   }
}	   

