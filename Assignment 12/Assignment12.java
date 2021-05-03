package Assignment12;
//File: Assignment12.java
//Assignment 12
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 12
*/
import java.util.Scanner;
public class Assignment12 
{
	static int count;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two integers seperated with a space: ");
		int m = Integer.parseInt(input.next());
		int n = Integer.parseInt(input.next());
		
		count = 0;
		System.out.println("The GCD of " + m + " and " + n  + " is " + gcd(m, n));
		System.out.println("Total " + count + " recursive calls");
		input.close();
	}
	private static int gcd(int m, int n) 
	{
		count ++;
		if (m == 0) 
		{
			return n; // Base case
		}
		else if (n == 0) 
		{
			return m;
		}
		else if (m % n == 0)
		{
			return n;
		}
		else 
		{// Recursive call
			return gcd(n, m % n);
		}
	}
}
