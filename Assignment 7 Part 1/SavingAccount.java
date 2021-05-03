package Assignment7_Part1;
//File: SavingAccount.java
//Assignment7_Part1
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment7_Part1
*/
public class SavingAccount extends Account 
{
	private int numberWithdraw = 0;
	private double minBalance = 0.0;
	private int maxWithdraw = 0;
	
	SavingAccount(int id, double minBalance)
	{
		super(id, minBalance);		
		this.minBalance = minBalance;
		setNumberWithdraw(numberWithdraw);
	}

	public void setNumberWithdraw(int numberWithdraw)
	{
		this.numberWithdraw = numberWithdraw;
	}
	
	public int getNumberWithdraw()
	{
		return numberWithdraw;
	}
	
	public double getMinBalance()
	{
		return minBalance;
	}
	
	public double getMaxWithdraw()
	{
		return maxWithdraw;
	}
	
	@Override
	public double getMonthlyInterestRate()
	{
		return getAnnualInterestRate()/12;
	}
	
	@Override
	public final void withdraw(double amount)
	{
		if(minBalance - amount >= 300)
		{
			numberWithdraw ++;
			if(numberWithdraw <= 3)
			{
				minBalance -= amount;
				System.out.printf("Account Number: " + getId() + ", Account Balance: $" + minBalance + "\n");
				System.out.printf("Withdraw complete.\n");
			}
			else 
			{
				System.out.printf("Account Number: " + getId() + ", Account Balance: $" + minBalance + "\n");
				System.out.printf("Unable to perform withdraw.\n");
				System.out.printf ("A SavingAccount can withdraw maximum 3 times in a month.\n");
			}	
		}
		else
		{
			System.out.printf("Account Number: " + getId() + ", Account Balance: $" + minBalance + "\n");
			System.out.printf("Unable to perform withdraw.\n");
			System.out.printf("A SavingAccount should maintain a minimum balance $    " + amount + "\n");
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("Account Number: " + getId() + ", Account Balance: $" + minBalance + "\n");
	}
}
