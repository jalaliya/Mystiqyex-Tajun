package InheritancePractice;

public class Child2 extends Child1{
	
	

	protected Child2()
	{
		System.out.println("Iam child2 Constructor");
	}
	
	protected void stitch()
	{
		System.out.println("child2 is stitching");
	}

	
	public static void main(String[] args)
	{
		Child2 ch2=new Child2();
		
		
	}
}
