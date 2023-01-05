package demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("khan",123);
		Employee emp2=new Employee("khan",12);
		Set mySet=new HashSet();
	
		mySet.add(emp1);
	    mySet.add(emp2);
	
	    
	    System.out.println(mySet);
	
	

	}

}
