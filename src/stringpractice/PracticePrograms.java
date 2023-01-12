package stringpractice;

import java.util.ArrayList;
import java.util.List;

public class PracticePrograms {
	
	public static void main(String args[])
	{
		
		//To iterate through ArrayList
		List<String> names=new ArrayList<String>();
		names.add("Jalaliya");
		names.add("kamaliya");
		names.add("Thowfika");
		names.add("Hasna");
		names.add("Haani");
		names.add("sana");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		//to find out whether ArrayList contains "Hasna"
		
		if(names.contains("Hasna"))
		{
			System.out.println("Name exists");
		}
		else
		{
			System.out.println("Name doesn't exists");
		}
	}

}
