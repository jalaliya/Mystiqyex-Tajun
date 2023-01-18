package testNGDemo;

import org.testng.annotations.Test;

public class DependanciesMangement {
	 
	@Test(enabled=true)
	public void tenth()
	{
		System.out.println("Tenth passed");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void highSchool()
	{
		System.out.println("Twelth passed");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void Engineering()
	{
		System.out.println("Admitted to Engineering");
	}
}
