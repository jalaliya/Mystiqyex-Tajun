package testNGDemo;

import org.testng.annotations.Test;

public class SkipTestcase {

	@Test(priority=0)
	public void startCar()
	{
		System.out.println("Strat car");
	}
	@Test(priority = 5,enabled = false)
	public void turnMusicOn()
	{
		System.out.println("Music ON");
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
	@Test(priority = 4)
	public void fourGear()
	{
		System.out.println("Fourth Gear");
	}
}
