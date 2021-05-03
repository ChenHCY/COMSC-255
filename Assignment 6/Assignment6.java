package Assignment6;
//File: Assignment6.java
//Assignment 6 
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 6 
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i <= 100;i++) 
		{
			if ((int)(Math.random() * 2) == 1) 
			{
			    accounts.add(new Account(1000 + i, (int)(Math.random()*1000))); 		   
			}
			else
			{
			    accounts.add(new CDAccount(1000 + i, (int)(Math.random()*1000), (int)(Math.random()*10)));
			}
		}
		
		while (true)
	   {
        java.util.Collections.shuffle(accounts);
          System.out.print("Please enter an account number to check the balance(0 to exit): ");
          Scanner input = new Scanner(System.in);
          int accountNumber = input.nextInt();
          if(accountNumber == 0)
          {
        	  break;
          }
          if(accounts.contains(new Account(accountNumber, 0)))
          {
             int i = accounts.indexOf(new Account(accountNumber, 0));
             if(i >= 0 && accounts.get(i) instanceof CDAccount)
             {
            	  System.out.printf("Account id: " + accounts.get(i).getId() + ", Account Type: CDAccount, " + " Account Mature balance: $" + String.format("%.2f",((CDAccount) accounts.get(i)).getMatureBalance()) + "\n");
             }
             else 
             {
            	  
            	  System.out.printf("Account id: " + accounts.get(i).getId() + ", Account balance: $" + accounts.get(i).getBalance()+"\n");
             }
          }
          else
          {
        	  System.out.print("Account Nmuber " + accountNumber + " doesn't exit.\n");
          }
       }
     }
 }
