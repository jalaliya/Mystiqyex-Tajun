package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {

	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	System.out.println("User is entrring Google");
	}

	@When("user is typing the search term")
	public void user_is_typing_the_search_term() {
		System.out.println("User is typing on search button");
	}

	@When("enters the return Key")
	public void enters_the_return_key() {
		System.out.println("User is printing enter key");
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
		System.out.println("user is seeing search results");
	}

}
