package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class TestArraylist {
	
	public static void main(String[] args)
	{
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(12);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		
		
		//maintains insertion order
		System.out.println(myList);
		
		//Random Access using Index
		System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		
		//remove element
		myList.remove(2);
		
		//get element
		myList.get(2);
		
		//set element
		myList.set(2, 110);
		
		//to print all elements in list using loop
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		
	}

}
