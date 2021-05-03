package LabExercise12;
//File: LabExercise12.java
//Lab Exercise 12
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: LabExercise12
*/
import java.util.Scanner;

public class LabExercise12 
{
	static int count = 0;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to diaplay all Fibonacci numbers: ");
		int index = input.nextInt();
		
		for (int i = 0; i <= index; i++)
		{
			count = 0;
			System.out.printf("Fibonacci(%2d) = %2d", i, fib(i));
			System.out.println(" *** number of recursive function called " + count);
		}
		input.close();
	}
	
	public static long fib(long index) 
	{
		 count ++;
		 if (index == 0) // Base case
		 {
			 return 0;
		 }
		 else if (index == 1)
		 {
			 return 1;
		 }
		 else // make the recursive calls
		 {
			 return fib(index - 1) + fib(index - 2);
		 }
	}
	
	
}
