package project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TestPopulation {

	@Test
	public void getPopulation() throws IOException {
		RestAssured.baseURI = "https://datausa.io/api/data";
		RequestSpecification requestSpecification = RestAssured.given().queryParam("drilldowns", "Nation")
				.queryParam("measures", "Population").log().all();
		Response response = requestSpecification.request(Method.GET, "");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());

		/*
		 * int population_2020_exp=326569308; JsonPath js=response.jsonPath(); int
		 * population_2020_actual=js.getJsonObject("data[0].Population");
		 * System.out.println(population_2020_actual);
		 * 
		 * Assert.assertEquals(population_2020_actual, population_2020_exp);
		 */

		
		  //converting objects to list
		  
			/*
			 * JsonPath js=response.jsonPath(); Object obj=
			 * js.getJsonObject("data..population"); System.out.println(obj.toString());
			 * List myList=(ArrayList)obj; System.out.println("Size of the list:"
			 * +myList.size()); // System.out.println(myList);
			 */		
		
		//using jayway json path
		File responseJsonFile=new File("sample.json");
		 List<Object> populationList=com.jayway.jsonpath.JsonPath.read(responseJsonFile,"data..Population");
		 System.out.println(populationList.size());
			
			  for (Object year : populationList) { System.out.println("Population:"
			  +year); }
			  
			  //assign actual values of population extracted from the response
			  int population2020actual=(int) populationList.get(0);
			  int population2019actual=(int) populationList.get(1);
			  int population2018actual=(int) populationList.get(2);
			  int population2017actual=(int) populationList.get(3);
			  int population2016actual=(int) populationList.get(4);
			  int population2015actual=(int) populationList.get(5);
			  int population2014actual=(int) populationList.get(6);
			  int population2013actual=(int) populationList.get(7);
			  
			  
			  //setting expected values for population
			  
			  int population2020exp=326569308;
			  int population2019exp=324697795;
			  int population2018exp=322903030;
			  int population2017exp=321004407;
			  int population2016exp=318558162;
			  int population2015exp=316515021;
			  int population2014exp=314107084;
			  int population2013exp=311536594;
			 
			  
			  //doing asssertion if actual and expected values are matching
			  Assert.assertEquals(population2020actual, population2020exp);
			  Assert.assertEquals(population2019actual, population2019exp);
			  Assert.assertEquals(population2018actual, population2018exp);
			  Assert.assertEquals(population2017actual, population2017exp);
			  Assert.assertEquals(population2016actual, population2016exp);
			  Assert.assertEquals(population2015actual, population2015exp);
			  Assert.assertEquals(population2014actual, population2014exp);
			  Assert.assertEquals(population2013actual, population2013exp);
		
	}

}
