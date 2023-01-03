package homeworkpractice;

import java.util.Scanner;

public class EldestAndYoungest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of First Person:");
		int firstAge=sc.nextInt();
		
		System.out.println("Enter age of Second Person:");
		int secAge=sc.nextInt();
		
		System.out.println("Enter age of Third Person:");
		int thirdAge=sc.nextInt();
		
		//to check the eldest
		if(firstAge>secAge && firstAge>thirdAge)
		{
			System.out.println("First  Person is Eldest");
		}
	

		else  if(secAge>thirdAge && secAge>firstAge)
		{
			System.out.println("Second Person is Eldest");
		}
		
	
		else
		{
			System.out.println("Third Person is Eldest");
		}
	
		//to check the youngest
		 if(firstAge<secAge && firstAge<thirdAge)
		{
			System.out.println("First  Person is Youngest");
					
		}
		else if(secAge<thirdAge && secAge<firstAge) 
		{
			System.out.println("Second  Person is Youngest");
					
		}
		
		else
		{
			System.out.println("Third Person is Youngest");
					
		}
	
	}

}
