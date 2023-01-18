package testNGDemo;

import org.testng.annotations.Test;

public class DriveCar {

	@Test(priority=0)
	public void startCar()
	{
		System.out.println("Strat car");
	}
	
	@Test(priority=1)
	public void putFirstGear()
	{
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void secGear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void thirdGear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority = 5)
	public void fourGear()
	{
		System.out.println("Fourth Gear");
	}
}
