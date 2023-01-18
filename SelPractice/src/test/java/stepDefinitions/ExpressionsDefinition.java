package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionsDefinition {
	
	
	
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	   System.out.println("Laptop Count:" +int1);
	}

	@Given("I have a {double} CGPA")
	public void i_have_a_cgpa(Double double1) {
	    System.out.println("CGPA:" +double1);
	}

	@Given("{string} is elser to {string} and {string}")
	public void is_elser_to_and(String string, String string2, String string3) {
	  System.out.println("Names are:" +string +string2 +string3);
	}

}
