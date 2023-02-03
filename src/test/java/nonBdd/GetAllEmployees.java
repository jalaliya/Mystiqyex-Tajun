package nonBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetAllEmployees {
	
	@Test
	public void getAllEmployees()
	{
		
	
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		ResponseBody body=response.getBody();
		String bodyAsString=body.asString();
		Assert.assertTrue(bodyAsString.contains("Lindsayre"));
	}

}
