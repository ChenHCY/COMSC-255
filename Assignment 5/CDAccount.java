package Assignment5;
//File: CDAccount.java
//Assignment 5
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 5
*/
public class CDAccount extends Account 
{
	   private int duration;
	   private double CDannualInterestRate = 0.0;

	   CDAccount()
	   {
	       setDuration(0);
	       setCDAnnualInterestRate();
	   }

	   CDAccount(int id, double balance, int duration) 
	   {
	       super(id, balance);
	       setDuration(duration);
	       setCDAnnualInterestRate();
	       
	   }

	   public void setDuration(int duration)
	   {
		   this.duration = duration;
	   }
	   
	   public int getDuration()
	   {
		   return duration;
	   }
	   
	   
	   public double getMatureBalance()
	   {
		   return getBalance() * Math.pow(((100 + CDannualInterestRate / 12)*0.01), duration);
	   }

	   public void setCDAnnualInterestRate()
	   {
		   this.CDannualInterestRate = Account.getAnnualInterestRate()*100 + getDuration() / 3 * 0.5;
	   }

	   public double getCDAnnualInterestRate() 
	   {
	       return CDannualInterestRate;
	   }

	   @Override
	   public double getMonthlyInterestRate() 
	   {
	       return (CDannualInterestRate / 12);
	   }

	   @Override
	   public double getMonthlyInterest() 
	   {
	       return getMonthlyInterestRate() * getBalance() * 0.01 ;
	   }

	   @Override
	   public final void withdraw(double amount) 
	   {
	       System.out.println("A CD Acount can't withdraw any cash. You may open another CD account");
	   }

	   @Override
	   public final void deposit(double amount)
	   {
	       System.out.println("A CD Acount can't make any additional deposit. You may open another CD account");
	   }
   
	   @Override
	   public String toString()
	   {
		   return String.format("\n%-20s%-20s%-20s%-20s%-20s\n", "Account Number", "Initial Balance", "Mothly Balance", "Rate(%)", "Date Created")
	       +("=======================================================================================================\n")
	       +String.format("%-20d%-20.2f%-20.2f%-20.2f%20s\n", getId(), getBalance(), getMatureBalance(), getCDAnnualInterestRate(), getDateCreated());   
	   }
	   
	   public void dispalyMonthlyInterests()
	   {
		   for(int i = 1; i <= duration; i++)
		   {
			   System.out.printf("Month %2d   %10.2f\n", i, getBalance() * Math.pow(((100 + CDannualInterestRate / 12)*0.01), i));
           }
	   }
}