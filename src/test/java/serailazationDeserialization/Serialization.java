package serailazationDeserialization;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Serialization {
	
	@Test
	public void testSerialization()
	{
		Map<String,String> body=new HashMap<String,String>();
		body.put("first_name", "raja");
		body.put("last_name", "rani");
		body.put("email","taj@gmail.com");
		
		
		given()
		.baseUri("http://localhost:/3000")
		.header("Content-Type","application/json")
		.body(body).log().all()
		.when()
		.post("/employees")
		.prettyPrint();
	}

	
	
	
	
}
