package stringpractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice2 {

	public static void main(String[] args) {
	
		//to iterate throug hashset
		Set<String> myCart=new HashSet<String>();
		myCart.add("Apple");
		myCart.add("cookie");
		myCart.add("chips");
		myCart.add("chicken");
		myCart.add("tissues");
		
		Iterator<String> itr=myCart.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//to find out if element exists in hashset
		if(myCart.contains("chips"))
		{
			System.out.println("Item is present in cart");
		}
		else {
			System.out.println("Item is not available");
		}
	}

}
