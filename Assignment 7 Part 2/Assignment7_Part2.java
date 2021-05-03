package Assignment7_Part2;
//File: Assignment7_Part2.java
//Assignment7_Part2
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment7_Part2
*/
public class Assignment7_Part2 
{
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException
	{
		// Create 5 ComparableAccount objects
		ComparableAccount[] accountArray = new ComparableAccount[5];
		for (int i = 0; i < accountArray.length; i++)
		{
			accountArray[i] = new ComparableAccount(1000+(i+1), 1000.0);
			accountArray[i].deposit(500);
			accountArray[i].withdraw(100*(i+1));
		}
		// Invoke the clone() method through the ComparableAccount array
		ComparableAccount[] accountCloneArray = accountArray.clone();
		Thread.sleep(1000);
		
		System.out.println("Clone Array from Array");
		// Print out the info of 5 ComparableAccount object from the clone array
		for (int i = 0; i < accountCloneArray.length; i++)
		{
			System.out.print(accountCloneArray[i]);
		}
		// Compare the dateCreate object from the original array and clone array - shallow copy
		for (int i = 0; i < accountCloneArray.length; i++)
		{
			System.out.println("CloneArray.dateCeated==OrignalArray.dateCreates[" + i + "] is : " + 
		(accountCloneArray[i].dateCreated==accountArray[i].dateCreated));
		}

		ComparableAccount[] accountCloneArrayElement = new ComparableAccount[accountArray.length];
		// Invoke the clone() method through each ComparableAccount object from the ComparableAccount array
		System.out.println("Clone Array from elements");
		for (int i = 0; i < accountArray.length; i++)
		{
			accountCloneArrayElement[i] = (ComparableAccount) accountArray[i].clone();
			System.out.print(accountCloneArrayElement[i]);
		}
	   //Compare the dateCreate object from the original array and clone array - deep copy
	   for (int i = 0; i < accountArray.length; i++)
	   {
		   System.out.println("CloneArray.dateCeated==OrignalArray.dateCreates[" + i + "] is : " + 
	    (accountCloneArrayElement[i].dateCreated==accountArray[i].dateCreated));
	   }
	   for (int i = 0; i < accountArray.length; i++)
	   {
		   System.out.println("CloneArray.dateCreated.compareTo(OrignalArray.dateCreates[" + i + "]) is : " + 
	   (accountCloneArrayElement[i].dateCreated.compareTo(accountArray[i].dateCreated)));
	   }
	   
	   System.out.println("Before Sorting");
	   for (int i = 0; i < accountArray.length; i++)
	   {
		   System.out.print(accountArray[i]);
	   }
	   
	   java.util.Arrays.sort(accountArray);
	   System.out.println("After Sorting");
	   for (int i = 0; i < accountArray.length; i++)
	   {
		   System.out.print(accountArray[i]);
	   }
     }
}
