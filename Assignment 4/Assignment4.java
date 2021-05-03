package Assignment4;
//File: Assignment4.java
//Assignment 4
/*
* Student name: ChenYu Yang
* Student ID: 1670203
* Course: COMSC-255-3666
* Lab: Assignment 4
*/

public class Assignment4 
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    	Course course = new Course("COMSC255: Programming with Java");
    	course.setInstructor("Laura Lo"); 
   
    	course.addStudent("Kim Smith");
    	course.addStudent("Paul Young");
    	course.addStudent("Sarah Lo");
    	course.addStudent("Ethan Chiang");
    	course.addStudent("John Smith");
    	course.addStudent("Debbie White");
    	course.addStudent("Snow White");
    	course.addStudent("Jeff Black");
    	course.addStudent("Tiffany Youg");
    	course.addStudent("Ed Shreena");
    	course.addStudent("Helena Orchid");
    	course.addStudent("Mary Brown");
    	course.addStudent("Tim Hazz");
    	course.addStudent("Reed Heart");
    	course.addStudent("Edward Johnson");
    	course.addStudent("Taylor Swift");
    	course.addStudent("Sawyer Fredericks");
    	course.addStudent("David Brownworth");
    	course.addStudent("James Allen");
    	course.addStudent("Hugh Jackson");
    	
    	course.dropStudent("Ed Shreena");
    	course.dropStudent("Tim Hazz");
    	course.dropStudent("James Allen");

    	course.addStudent("Bradly Cooper");
    	course.addStudent("Eddie Walter");
    
    	course.print();
    	System.out.println("Students' list after call clear()");
    	course.clear();
    	course.print();
     }
}
