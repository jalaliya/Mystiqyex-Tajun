package bdd;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class PostEmployee {

	@Test
	public void postEmp()
	{
		//File inputJsonFile=new File("sample.json");
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
		.prettyPrint();
	}
}
