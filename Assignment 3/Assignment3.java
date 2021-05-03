package Assignment3;
//File: Assignment3.java
//Assignment 3
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 3
*/
import java.util.Date;
import java.util.Formatter;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Account[] accounts = new Account[5];
             System.out.printf("\n%-20s%-20s%-20s%-20s%-20s\n", "Account Number", "Initial Balance", "Mothly Interest", "Balance", "Date Created");
              System.out.println("=================================================================================================================");
              for(int i = 0; i < 5; i++)
              {
                 accounts[i] = new Account(1000*(i+1), 1000*(i+1));
                 accounts[i].setAnnualInterestRate(3);
                 accounts[i].withdraw(500);
                 accounts[i].deposit(1000);   
                 
                 System.out.printf("%-20d%-20.2f%-20.2f%-20.2f%20s\n", accounts[i].getId(), accounts[i].getBalance(), 
                 accounts[i].getMonthlyInterest(), accounts[i].getBalance()+accounts[i].getMonthlyInterest(), accounts[i].getDateCreated());   
             }
	}

}
