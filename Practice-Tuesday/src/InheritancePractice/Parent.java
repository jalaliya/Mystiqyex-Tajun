package InheritancePractice;

public class Parent {
	
	Parent()
	{
		System.out.println("Iam Parent Constructor");
	}
	
	protected int salary=40000;//Use Protected to access it in child3
	
	protected void getSalary()
		{
			System.out.println("Parent salary");
		}
		
		protected void work()
		{
			System.out.println("Parent Working");
		}

	
		
}
