// File: LabExercise2.java
// LabExercise2 class implementation
/*
 * Student name: Chenyu Yang
 * Partner Name: Xinchen Zhang
 * Student ID: 1670203
 * Course: COMSC-255-3666
 * Lab: Lab Exercise 2
 */
import java.util.Scanner;
public class LabExercise2 
{
   public static void main(String[] args) 
   {
	  // TODO Auto-generated method stub
	   Scanner input = new Scanner(System.in);
	 // Prompt the user to enter an integer
	   System.out.print("Enter a postive number: ");
	   double number = input.nextDouble();
	   
	// Display the square root
	   System.out.println("The square root of " + number + " is: " + sqrt(number));
   }

   public static double sqrt(double n) 
   {
		double lastGuess = 1.0;	// Initial guess to positive value
		double nextGuess = (lastGuess + n / lastGuess) / 2.0; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// return nextGuess as the approximated square root of n.
		while (nextGuess - lastGuess > 0.0001 || nextGuess - lastGuess < -0.0001) 
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
	}
}
