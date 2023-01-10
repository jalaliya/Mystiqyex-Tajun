package collectionpractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<Integer> mySet=new HashSet<Integer>();
		mySet.add(34);
		mySet.add(45);
		mySet.add(23);
		
		
		//Adding duplicate value
		mySet.add(34);
		System.out.println(mySet);//set does not allow duplicate
		
		
		//iterator is used to iterate over the set
		Iterator<Integer> myIterator=mySet.iterator();
		
		
		//does not maintain order
		while(myIterator.hasNext())
		{
			System.out.println(myIterator.next());
		}

	}

}
