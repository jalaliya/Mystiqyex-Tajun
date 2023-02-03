package bdd;

import static  io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class GetAllEmployees {
	
	@Test
	public void getEmployees()
	{
		
		given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
		
	}

	

	@Test
	public void postEmp()
	{
		File inputJsonFile=new File("sample.json");
		given()
		.baseUri("http://localhost:/3000")
		.header("Content-Type","application/json")
		.body(inputJsonFile)
		.when()
		.post("/employees")
		.prettyPrint();
	}
}
