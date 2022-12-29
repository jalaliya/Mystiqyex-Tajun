package InheritancePractice2;

import InheritancePractice.Child2;

public class Child3 extends Child2 {
	
	public Child3() {
		//super();
		System.out.println("Iam child 3 constructor");
		
	}
	public void MedicalCoder()
	{
		System.out.println("Iam Medical coder");
	}
    public void hijamaDoctor()
    {
	
    	System.out.println("Iam Hijama Doctor");
    }

public static void main(String[] args)
{
	Child3 ch3=new Child3();
	//Accessing parent class method
	//ch3.work();
	//Accessing protected modifier from Parent class
	//ch3.getSalary();
    //applying the use of protected
	//ch3.salary=30000;
	//System.out.println(ch3.salary);
	//System.out.println(super.salary);
	 
}
}
