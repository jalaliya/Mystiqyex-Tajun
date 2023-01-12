package stringpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumOfOccurence {

	public static void main(String[] args) {
		Map<Character,Integer> myMap=new HashMap<Character,Integer>();
		String s="Tajunjalaliya";
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(myMap.containsKey(s.charAt(i)))
			{
				myMap.put(s.charAt(i),myMap.get(s.charAt(i))+1);
			}
			else
			{
				myMap.put(s.charAt(i), 1);
			}
		
		}
	//to print the map	
//System.out.println(myMap);

//to print the key

	
	  Set<Character> myKeyset=myMap.keySet();
	  for(Character c :myKeyset)
	  {
	  System.out.println(c + " " +myMap.get(c));
	  }
	 

//to find duplicate character
	  System.out.println("Duplicate Characters");
	  System.out.println("---------------------");
		for(Character c :myKeyset)
		{
			if(myMap.get(c) > 1)
			{
				System.out.println(c);
			}
		}


	}

}
