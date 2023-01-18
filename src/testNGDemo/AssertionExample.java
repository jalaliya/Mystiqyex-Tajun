package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	//used for the purpose of unit testing
	
	String name="tajun";
	
	
	@Test
	public void checkEqual()
	{
	Assert.assertEquals(name, "Tajun");	
	Assert.assertNotEquals(name, "tah");
	}


}
