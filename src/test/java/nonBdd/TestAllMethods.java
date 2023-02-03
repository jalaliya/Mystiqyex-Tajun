package nonBdd;


import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;




public class TestAllMethods {
	 RequestSpecification requestSpecification;
	Response response;
	
	@BeforeMethod
	public void initialization()
	{
		 RestAssured.baseURI="http://reqres.in/api";
		 requestSpecification=RestAssured.given(); 
		
	}
	
	  @Test
	  public void get()
	  { 
     
	  Response response=requestSpecification.request(Method.GET,"/users?page=2");
	  System.out.println(response.asPrettyString());
	  System.out.println(response.getStatusCode());
	  Assert.assertEquals(0, 200);
	  
	  }
	 
	
	@Test
	public void postData()
	{
		
	JSONObject request=new JSONObject();
	request.put("name", "kamaliya");
	request.put("job", "substitute");
	System.out.println(request.toJSONString());
	
	RestAssured.baseURI="http://reqres.in/api";
	requestSpecification=RestAssured.given().header("Content-Type","application/json").
			body(request.toJSONString());
	response=requestSpecification.request(Method.POST,"/users");
	System.out.println(response.statusCode());
	}
	

  @Test 
  public void putData() 
  { 
	  
  
  JSONObject request=new JSONObject(); 
  request.put("name", "kamaliya");
  request.put("job", "substitute"); 
  System.out.println(request.toJSONString());
  
  RestAssured.baseURI="http://reqres.in/api";
  
  requestSpecification=RestAssured.given().header("Content-Type",
  "application/json"). body(request.toJSONString());
  Response
  response=requestSpecification.request(Method.PUT,"/users/2");
  System.out.println(response.statusCode()); 
  }
 
	
	
/*
 * @Test public void delData() {
 * 
 * 
 * JSONObject request=new JSONObject(); request.put("name", "kamaliya");
 * request.put("job", "substitute"); System.out.println(request.toJSONString());
 * 
 * RestAssured.baseURI="http://reqres.in/api"; RequestSpecification
 * requestSpecification=RestAssured.given();
 * 
 * Response response=requestSpecification.request(Method.DELETE,"/users/2");
 * System.out.println(response.statusCode()); }
 */
	 
/*
 * @Test public void getEmployee() {
 * RestAssured.baseURI="http://localhost:3000/"; RequestSpecification
 * requestSpecification=RestAssured.given(); Response
 * response=requestSpecification.request(Method.GET,"employees"); int
 * statusCode=response.statusCode(); assertEquals(statusCode, 200);
 * 
 * }
 */
	
	/*
	 * @Test
	 * 
	 * public void createEmployee() { JSONObject request=new JSONObject();
	 * request.put("id", "51"); request.put("first_name", "Rayyan");
	 * request.put("last_name", "Sahubar"); request.put("email", "abc@ftft.com");
	 * 
	 * 
	 * 
	 * RestAssured.baseURI="http://localhost:3000/"; RequestSpecification
	 * requestSpecification=RestAssured.given().header("Content-Type",
	 * "application/json").body(request.toJSONString()); Response
	 * response=requestSpecification.request(Method.POST,"employees"); int
	 * statusCode=response.statusCode(); assertEquals(statusCode, 201);
	 * 
	 * }
	 */
	
	
	

  @Test
  public void delData() {
  
  
  
  RestAssured.baseURI="http://localhost:3000/";
  RequestSpecification
  requestSpecification=RestAssured.given();
  
  Response response=requestSpecification.request(Method.DELETE,"employees/51");
  System.out.println(response.statusCode());
  
  }
 
	
	
}
