package stringpractice;

public class Palindrome {

	public static void main(String[] args) {
	String s="Hello";
		
		String revString=reverseString(s);
		if(s.equals(revString))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
		
	}
	
	public static String reverseString(String s)
	{
		String rev="";

      for(int i=s.length()-1;i>=0;i--)
		 {
	
	    rev=rev+s.charAt(i);
	   
	
          }
	return rev;
		
	}

	}


