package Assignment3;
//File: Account.java
//Assignment 3
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 3
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account 
{
	   private int id = 0;
	   private double balance = 0;
	   private double annualInterestRate = 0;
	   private Date dateCreated;
  
  public Account()
	   {
	       //super();
	       this.dateCreated = new Date();
	   }

	   public Account(int id, double balance) 
	   {
	     //  super();
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

	   public double getAnnualInterestRate() 
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
	       this.annualInterestRate = annualInterestRate;
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
	       return getMonthlyInterestRate() * 0.01 * balance;
	   }

	   public void withdraw(double amount) 
	   {
	       setBalance(getBalance() - amount);
	   }

	   public void deposit(double amount) 
	   {
	       setBalance(getBalance() + amount);
	   }

}