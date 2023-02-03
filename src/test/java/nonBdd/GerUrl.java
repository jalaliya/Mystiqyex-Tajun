package nonBdd;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GerUrl {

	@Test
	public void getUrl()
	{
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"");
		
		System.out.println(response.prettyPrint());
		System.out.println(response.getStatusCode());
		//System.out.println(response.getTime());
		int code=response.getStatusCode();
		ResponseBody body=response.getBody();
		String bodyAsString=body.asString();
		Assert.assertTrue(bodyAsString.contains("George"));
		Assert.assertEquals(code, 200);
		
	}
}
