package Assignment5;
//File: CDAccount.java
//Assignment 5
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 5
*/

public class Assignment5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CDAccount[] CDAccounts = new CDAccount[5];
		for(int i = 0; i < CDAccounts.length; i++)
		{
			CDAccounts[i] = new CDAccount(1000*(i+1), 1000*(i+1), 3*(i+1));
			System.out.print(CDAccounts[i].toString());
			CDAccounts[i].dispalyMonthlyInterests();
			
			CDAccounts[i].withdraw(500);
			CDAccounts[i].deposit(1000);
		}

	}

}
