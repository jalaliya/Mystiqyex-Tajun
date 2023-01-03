package homeworkpractice;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args)
	{
		//Getting two numbers from user
		System.out.println("Enter two Numbers:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
		    System.out.println(+num1 +"  is greater");
		}

		else
		{
			System.out.println(+num2 +"  is greater");
		}
	}

}
