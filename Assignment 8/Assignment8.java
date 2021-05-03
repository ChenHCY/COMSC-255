package Assignment8;
//File: Assignment8.java
//Assignment 8
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 8
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment8
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> account = new ArrayList<Account>();
        boolean option = false;
        int accountNumStart = 1000;

        System.out.println("Please enter the file name:");
        String fileName = sc.nextLine();
        java.io.File file = new java.io.File(fileName); 
        if(file.exists())
        {
            System.out.println("File already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new PrintWriter(file); //new write pointer

        System.out.println("Provide the following information to open an Account");
        do{
            double depositAmount = getDouble(sc, "Enter the initial deposit amount ($):\n");
            int newDuration = getNonNegativeInt(sc, "Enter the account duration(months), 0 to open a Saving or Checking Account:\n");

            if(newDuration != 0)
            {
                account.add(new CDAccount(accountNumStart,depositAmount,newDuration));
                accountNumStart++;
            } 
            else 
            {
                int getNum = getNonNegativeInt(sc, "Enter 1 to open a Saving Account, 2 to open a Checking Account:\n");
                if(getNum == 1)
                {
                    account.add(new SavingAccount(accountNumStart,depositAmount));
                    accountNumStart++;
                } 
                else if (getNum == 2)
                {
                    account.add(new CheckingAccount(accountNumStart,depositAmount));
                    accountNumStart++;
                } 
                else 
                {
                    System.out.println("Error! Invalid value. Try again.");
                }
            }

            int getOption = getNonNegativeInt(sc, "Enter 1 to open another Account:\n");
            if(getOption == 1)
            {
                option = true;
            }
            else
            {
                option = false;
            }
        }
        while(option);

        System.out.printf("Account_Number    Initial_balance($)    Annual_interest_Rate(%%)    Account_Type\n");
        System.out.println("================================================================================");
        String allAccountsInfo = String.format("");
        
        for(int i = 0; i < account.size(); i++)
        {
            if(account.get(i) instanceof CDAccount)
            {
                allAccountsInfo += String.format("%11d%20.2f%20.2f%26s",account.get(i).getId(), account.get(i).getBalance(), account.get(i).getMonthlyInterestRate()*12,"CDAccount");
            }
            else if (account.get(i) instanceof CheckingAccount)
            {
                allAccountsInfo += String.format("%11d%20.2f%20.2f%26s",account.get(i).getId(), account.get(i).getBalance(), 0.00,"CheckingAccount");
            }
            else if(account.get(i) instanceof SavingAccount)
            {
                allAccountsInfo += String.format("%11d%20.2f%20.2f%26s",account.get(i).getId(), account.get(i).getBalance(), 3.00,"SavingAccount");
            }
            allAccountsInfo += String.format("\r\n");
        }

        System.out.println(allAccountsInfo);
        output.print(allAccountsInfo);
        output.close();
    }


    public static int getNonNegativeInt(Scanner sc, String prompt){
        int b = 0;
        boolean isValid = false;
        while(!isValid)
        {
            System.out. printf(prompt);

            if(sc.hasNextInt())
            {
                b = sc.nextInt();
                if(b >= 0)
                {
                    isValid = true;
                }
                else
                {
                    System.out.println("Error! Invalid negative value. Try again.");
                }
            } 
            else
            {
                System.out.println("Error! Invalid Integer value. Try again.");
            }
            sc.nextLine();
        }
        return b;
    }

	public static double getDouble(Scanner sc, String prompt)
	{
        double b = 0;
        boolean isValid = false;
        while (!isValid){
            System.out.printf(prompt);
            if(sc.hasNextDouble())
            {
                b = sc.nextDouble();
                isValid = true;
            } 
            else 
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();
        }
        return b;
    }
}
