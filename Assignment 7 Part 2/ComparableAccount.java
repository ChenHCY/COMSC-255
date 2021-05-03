package Assignment7_Part2;
//File: ComparableAccount.java
//Assignment7_Part2
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment7_Part2
*/
import java.util.Date;
public class ComparableAccount extends Account implements Comparable<ComparableAccount>,Cloneable
{
	 ComparableAccount(int id,double balance)
	 {
		 //pass to super class(Account class) constructor
		 super(id,balance);
	 }
	 
	 //override the toString method to display the field details
	 @Override
	 public String toString()
	 {
		 return ("Account ID: "+ getId() + " Balance: "+ getBalance() +" Date Created: "+getDateCreated() + "\n");
	 }
	 
	//Override comapreTo method
	//This method will compare the balance of two object
	//returns 1 or -1 when not equal
	//returns 0 when equal
	 @Override
	 public int compareTo(ComparableAccount obj) 
	 {
		 if(getBalance() > obj.getBalance()) 
		 {
			 return 1;
		 }
	     else if(this.getBalance()<obj.getBalance()) 
	     {
	    	 return -1;
	     }
	     else 
	     {
	    	 return 0;
	     }
	 }
	 @Override
	 public Object clone()throws CloneNotSupportedException
	 {
		 //clone
		 ComparableAccount account=(ComparableAccount)super.clone();
		 account.dateCreated = (Date) this.getDateCreated().clone();
		 return account;
	 }
}
