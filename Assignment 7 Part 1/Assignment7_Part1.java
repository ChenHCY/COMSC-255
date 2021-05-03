package Assignment7_Part1;
//File: Assignment7_Part1.java
//Assignment7_Part1
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment7_Part1
*/
import java.util.ArrayList;
public class Assignment7_Part1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(new SavingAccount(1000, 2000));
		accounts.add(new SavingAccount(1001, 800));
		accounts.add(new CheckingAccount(1002, 1000));
		
		for (int i = 0; i < 5; i++)
			for (Account a: accounts)
				a.withdraw(300);	
	}
}
