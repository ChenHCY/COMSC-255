package LabExercise6;
//File: LabExercise6.java
//Lab Exercise 6 
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Lab Exercise 6 
* Partner: XinChen Zhang
*/
import java.util.ArrayList;
public class LabExercise6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < 100;i++) 
		{
			if ((int)(Math.random() * 2) == 1) 
			{
			    accounts.add(new Account(1000 + i,1000* ((int)(Math.random()*7)+1))); 		   
			}
			else
			{
			    accounts.add(new CDAccount(1000 + i, 1000* ((int)(Math.random()*7)+1), (int)(Math.random()*10)));
			}
		}
		
        for(int i = 1; i<=10; i++)
		{ 
            accounts.add(new Account(1001, accounts.get(i).getBalance()));
           //or
            accounts.add(new CDAccount(1001, accounts.get(i).getBalance(), i));
             
            System.out.print(accounts.get(i).toString());
           
            accounts.get(i).withdraw(500);
			accounts.get(i).deposit(1000);
			System.out.print(accounts.get(i).toString());

        }
	}
}
