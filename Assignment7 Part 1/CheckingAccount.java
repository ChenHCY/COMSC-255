package Assignment7_Part1;
//File: CheckingAccount.java
//Assignment7_Part1
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment7_Part1
*/
public class CheckingAccount extends Account 
{
	private double minBalance;
	
	CheckingAccount(int id, double minBalance)
	{
		super(id, minBalance);
		this.minBalance = minBalance;
	}
	
	public double getMinBalance()
	{
		return minBalance;
	}
	
	@Override
	public double getMonthlyInterestRate()
	{
		return 0;
	}
	
	@Override
	public final void withdraw(double amount)
	{
		if(amount <= minBalance)
		{
			minBalance -= amount;
			System.out.printf("Account Number: " + getId() + ", Account Balance: $" + minBalance  + "\n");
			System.out.printf("Withdraw complete.\n");
		}
		else
		{
			System.out.printf("Account Number: " + getId() + ", Account Balance: $" + minBalance  + "\n");
			System.out.printf("No Sufficient balance to perform the withdraw.\n");
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("Account Number: " + getId() + ", Account Balance: $" + minBalance  + "\n");
	}
}
