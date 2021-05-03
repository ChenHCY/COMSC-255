// File: Assignment1.java
// Assignment1 class implementation
/*
 * Student name: Chenyu Yang
 * Student ID: 1670203
 * Course: COMSC-255-3666
 * Lab: Assignment 1
 */
import java.util.Scanner;
public class Assignment1 
{
  public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    int computer; 
	    int player;
	    int point = 1; 
	    int pointComputer = 0; 
	    int pointPlayer = 0;
	    
	    Scanner input = new Scanner(System.in);
	    while((pointPlayer != 3) && (pointComputer != 3))
	    {
	        System.out.print("Please enter your choice - Scissor(0), Rock(1), Paper(2): ");
	        player = input.nextInt();
	        computer = (int)(Math.random() * 3);
	        
	        if ((computer == 0) && (player == 2))
	        {
	            System.out.println("You lost!");
	            pointComputer += point;
	        }
	        else if ((computer == 1) && (player == 0))
	        {
	            System.out.println("You lost!");
	            pointComputer += point;
	        }
	        else if ((computer == 2) && (player == 1))
	        {
	            System.out.println("You lost!");
	            pointComputer += point;
	        }
	        else if ((computer == 1) && (player == 2))
	        {
	            System.out.println("You win!");
	            pointPlayer += point;
	        }
	        else if ((computer == 1) && (player == 2))
	        {
	            System.out.println("You win!");
	            pointPlayer += point;
	        }
	        else if ((computer == 2) && (player== 0))
	        {
	            System.out.println("You win!");
	            pointPlayer += point;
	         }
	        else if ((computer == 0) && (player == 0))
	        {
	            System.out.println("It's a draw!");
	       }
	        else if ((computer == 1) && (player == 1))
	        {
	            System.out.println("It's a draw!");
	        }
	        else if ((computer == 2) && (player == 2))
	        {
	            System.out.println("It's a draw!");
	        }
	        else 
	        {
	            System.out.println("You can only choose between 0, 1, and 2");
	        }
	    }

	    if (pointComputer >= 3)  
	    {
	    	System.out.println("Sorry,you lost. The computer got first three wins.");
	    }
	        
	    else if (pointPlayer >= 3)
        {
	        System.out.println("Congratulations, You got the first three wins.");
	    }

	}

}
