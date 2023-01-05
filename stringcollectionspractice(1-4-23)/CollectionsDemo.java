//hashMap practice program
package demo;

import java.util.HashMap;

public class CollectionsDemo {
	
	public static void main(String[] args)
	{
		String name="hasnasahubar";
		char[] ch=name.toCharArray();//to character Array
		HashMap<Character,Integer> letterCount=new HashMap<Character,Integer>();
		
	
		for(int i=0;i<name.length();i++)
		{
			if(letterCount.containsKey(ch[i]))
			{
				letterCount.put(ch[i], letterCount.get(ch[i])+1);
			}
			
			else
			{
				letterCount.put(ch[i], 1);
			}
		}
}
}


