package collectionpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashmap {

	public static void main(String[] args) {
		
		
		Map<String,Integer> myMap=new HashMap();
		//to add values
		myMap.put("ant", 4);
		myMap.put("bee", 25);
		myMap.put("dog", 3);
		
		/*
		 * //tp print hashMAp System.out.println(myMap);
		 * 
		 * //to print length System.out.println(myMap.size());
		 */
		
		//to remove all entries from map
	//myMap.clear();
	
		
		//map does not allow  duplicate keys
		//myMap.put("ant", 34);
		
		//to print length
				//System.out.println(myMap.size());
				
				
				//to retreive keySet
				Set<String> myKeyset=myMap.keySet();
				for(String  key : myKeyset)
				{
					System.out.println(myMap);
				}
		
		
	
		

	}

}
