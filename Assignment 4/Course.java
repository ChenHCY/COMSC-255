package Assignment4;
//File: Course.java
//Assignment 4
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 4
*/
public class Course 
{
	private String courseName;
	private String instructor;
	private String[] students = new String[16];
	private int capacity = 16;
	private int numberOfStudents;
	
	public Course(String courseName) 
	{
		this.courseName = courseName;
	}
	
	public Course(String courseName, String instructor)
	{
		this.courseName = courseName;
		this.instructor = instructor;
	}
	
	public String getCourseName() 
	{
		return courseName;
	}
	
	public void setInstructor(String instructor)
	{
		this.instructor = instructor;
	}
	
	public String getInstructor()
	{
		return instructor;
	}
	
	public String[] getStudents() 
	{
		return students;
	}
	
	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}
	
	private void increaseSize() 
	{
		String[] temp = new String[capacity*2];
		System.arraycopy(students, 0, temp, 0, students.length);
		students = temp;
		capacity = capacity * 2;
	}
	
	public void addStudent(String student)
	{
		if(numberOfStudents >= capacity)
		{
			increaseSize();
		}
		students[numberOfStudents++] = student;
		System.out.println("**" + student + " was added into " + courseName);
	}
	
	public void dropStudent(String student)
	{
		int Index = -1;
		for (int i = 0; i < numberOfStudents; i++) 
	    {
	        if (students[i].equals(student)) 
	        {
	            Index = i;
	            if (Index != -1) 
	            {
	                for (i = Index; i < numberOfStudents; i++)
	                	{
	                	   students[i] = students[i+1];
	                	}
	            } // end if found
	            // decrement number of students by 1
	            numberOfStudents--;
	            System.out.println("##"+ student + " was dropped into " + courseName);
	        }
	    }
	}
	
	public void clear() 
	{
		for (int i = 0; i < numberOfStudents; i ++)
		{
	        students [i] = null;
	    }
	    numberOfStudents = 0;
	 }
	
	public void print()
	{
		System.out.println("=====================================================================");
    	System.out.println("Course Name: " + getCourseName());
    	System.out.println("Instructor Name: " + getInstructor());
    	System.out.println("There is(are) " + getNumberOfStudents() + " student(s) enrolled.");
    	if(numberOfStudents != 0)
      {
    	System.out.println("The list of students: ");
    	for(int i = 0; i < getNumberOfStudents(); i++)
    	{
    		if(i % 5 == 4)
    		{
    			System.out.println(students[i] + "  ");
    		}
    		else
    		{
    			System.out.print(students[i] + "  ");
    		}
        }
    	System.out.println();	
      }
	}
	
}
