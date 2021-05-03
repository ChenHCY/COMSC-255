// File: Assignment2.java
// Assignment1 class implementation
/*
 * Student name: Chenyu Yang
 * Student ID: 1670203
 * Course: COMSC-255-3666
 * Lab: Assignment 2
 */
import java.util.Scanner;
public class Assignment2 
{
  public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter a sorted list1: (start with the size of the list)");
	  int size1 = input.nextInt();
	  int[] list1 = new int[size1];
	  list1[0] = size1;
	  for (int i = 0; i < size1; i++) 
	  {
	  list1[i] = input.nextInt();
	  }
	  
	  System.out.print("Enter a sorted list2: (start with the size of the list)");
	  int size2 = input.nextInt();
	  int[] list2 = new int[size2];
	  for (int i = 0; i < size2; i++) 
	  {
	  list2[i] = input.nextInt();
	  }
	  int[] mergedList = merge(list1, list2);
	  
	  System.out.println("The list of the merged array with " + mergedList.length + " elements:");
	  for (int i = 0; i < mergedList.length; i++) 
	  {
	  System.out.print(mergedList[i]+" ");
	  }
    }
  
  public static int [] merge (int[] list1, int[] list2)
  {
	  int[] list3 = new int[ list1.length + list2.length ];
	  int i = 0;
	  int j = 0;
	  int index = 0;
	  while( i < list1.length && j < list2.length )
	  {
		  if( list1[i] <= list2[j] )
		  {
			  list3[index++] = list1[i];
			  i++;
		  }
          else
          {
        	  list3[index++] = list2[j];
        	  j++;
          }
	  }
      while( i < list1.length )
      {
    	  list3[index++] = list1[i];
    	  i++;
      }
      while( j < list2.length )
      {
    	  list3[index++] = list2[j];
    	  j++;
      }
      return list3;
      }
 }
