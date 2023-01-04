package practiceexercisesloops;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=num;i>0;i--)
		{
			 factorial=factorial*i;
		
		}
System.out.println(factorial);
	}

}
