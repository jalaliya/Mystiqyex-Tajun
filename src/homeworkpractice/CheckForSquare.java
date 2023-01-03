package homeworkpractice;

import java.util.Scanner;

public class CheckForSquare {
	
	public static void main(String[] args)
	{  
		//Getting length from the user
		System.out.println("Enter the length");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		
		//Getting the breadth from the user
		System.out.println("Enter the breadth");
	    int breadth=sc.nextInt();
	    
	    //checking if length and breadth are equal
	    if(length == breadth)
	    {
	    	System.out.println("This is a Square");
	    	
	    }
	    else
	    {
	    	System.out.println("This is not a Square");
	    }
	}

}
