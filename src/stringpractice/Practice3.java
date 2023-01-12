package stringpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {

	public static void main(String[] args) {
	//To iterate through hashmap
		
		Map<String,Integer> myMap=new HashMap<String,Integer>();
		myMap.put("Jallaiya", 30);
		myMap.put("Hasna", 6);
		myMap.put("Haani", 3);
		myMap.put("sahubar", 37);
		
		Set<String> myKeyset=myMap.keySet();
		//To print hashMap
		System.out.println(myMap);
		
		System.out.println("All values in map are:");
		for(String key:myKeyset)
		{
			System.out.println(myMap.get(key));
		}

	}

}
