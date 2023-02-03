package schemaValidation;

import io.restassured.RestAssured;


import java.io.File;

import org.testng.annotations.Test;





public class ValidationInClassPath {

	@Test
	public void validationUsingClassPath()
	{
		File schemaFile=new File("C://users/resoudes/schema.json");
		RestAssured.
		given()
		.baseUri("http://localhost:/3000")
		.header("Content-Type","application/json")
		.body("  {\r\n"
				+ "    \"first_name\": \"Hayana\",\r\n"
				+ "    \"last-name\": \"sahubar\",\r\n"
				+ "    \"email\": \"gftywftss@gmail.com\"\r\n"
				+ "    \r\n"
				+ "  }")
		.when()
		.post("/employees")
		.then()
		//.body(JsonS.matchesJsonSchemaInClassPath("schema.json"));
		.body(JsonSchemaValidatir.matchesJsonSchems(schemaFile));
	}
	
	
	
}
