package testNGDemo;

import org.testng.annotations.Test;

public class GroupingExample {
	//vivo and moto should get executed

	@Test(groups = {"Apple"})
	public void apple1()
{
	System.out.println("Apple1");
}
	@Test(groups = {"Apple"})
	public void apple2()
{
	System.out.println("Apple2");
}
	
	@Test(groups = {"Moto"})
	public void moto1()
{
		System.out.println("Moto1");
	
}
	
	@Test(groups = {"Moto"})
	public void moto2()
{
	System.out.println("Moto2");
}
	
	@Test(groups = {"vivo"})
	public void vivo1()
{
	System.out.println("vivo1");
}
	
	@Test(groups = {"vivo"})
	public void vivo2()
{
	System.out.println("vivo2");
}
	
	@Test(groups = {"lenovo"})
	public void lenovo1()
{
	System.out.println("Lenovo1");
}
	
	@Test(groups = {"lenovo"})
	public void lenovo2()
{
	System.out.println("Lenovo2");
}


}
