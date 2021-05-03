/*
 *Student name: Chenyu Yang
 *student ID: 1670203
 *class: COMSC-255-3666
 *Lab exercise: Lab Exercise0 
*/
package week1;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class LabExercise0 
{
    public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
      String name;
      name = JOptionPane.showInputDialog(null, "Please enter your name: ","Comsc255 Lab Exercise 0",JOptionPane.WARNING_MESSAGE);
      String name_1;
      name_1 = name + " Welcome to Java";
      
      JOptionPane.showMessageDialog(null, name_1,"Comsc255 Lab Exercise 0",JOptionPane.WARNING_MESSAGE );
      System.exit(0);
	}

}
