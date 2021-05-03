package LabExercise6;
//File: Account.java
//Lab Exercise 6 
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Lab Exercise 6 
* Partner: XinChen Zhang
*/
import java.util.Date;
public class Account 
{
	   private int id = 0;
	   private double balance = 0.0;
	   static double annualInterestRate = 0.03;
	   private Date dateCreated;
	   
	   public Account()
	   {
	       this.dateCreated = new Date();
	   }

	   public Account(int id, double balance) 
	   {
	       this.id = id;
	       this.balance = balance;
	       this.dateCreated = new Date();
	   }

	   public int getId() 
	   {
	       return id;
	   }

	   public double getBalance() 
	   {
	       return balance;
	   }

	   public static double getAnnualInterestRate() 
	   {
	       return annualInterestRate;
	   }

	   public void setId(int id) 
	   {
	       this.id = id;
	   }

	   public void setBalance(double balance) 
	   {
	       this.balance = balance;
	   }

	   public void setAnnualInterestRate(double annualInterestRate) 
	   {
	       Account.annualInterestRate = annualInterestRate;
	   }

	   public Date getDateCreated()
	   {
	       return dateCreated;
	   }

	   public double getMonthlyInterestRate() 
	   {
	       return (annualInterestRate / 12);
	   }

	   public double getMonthlyInterest() 
	   {
	       return getMonthlyInterestRate() * balance * 0.01 ;
	   }

	   public void withdraw(double amount) 
	   {
	      this.balance = getBalance() - amount;
	   }

	   
	   public void deposit(double amount) 
	   {
	       this.balance = getBalance() + amount;
	   }
	   
       @Override
       public String toString()
       {
    	   return String.format("Account id: " + getId() + " Account balance: $" + getBalance()+"\n");
       }
}
