package demo;

public class PalindromeDemo {

	public static void main(String[] args) {
		
		int[] inputArray= {121,333,444,20};
		boolean res=isPalinArray(inputArray);
		if(res == true)
		{
			System.out.println("Palindrome Array");
			
		}
		else 
		{
			System.out.println("Not a palindrome Array");
		};   
		

	}
	
	public static boolean isPalinArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean result=isPalindrome(arr[i]);
			if(result == false)
			
				return true;
			
		}
		return true;
	}
	
	public static boolean  isPalindrome(int num)
	{
		String s=" "+num;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-1-i))
			
				return false;
			
		}
		return true;
	}

}
