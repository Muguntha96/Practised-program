package org.restassured.non_bdd.style;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
@Test
	public void Post_request() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification = RestAssured.given()
				.contentType("application/json")
				.body("{\r\n"
						+ "        \"name\": \"Muguntha\",\r\n"
						+ "        \"salary\": \"50000\",\r\n"
						+ "        \"age\": \"28\",\r\n"
						+ "        \"id\": 290\r\n"
						+ "    }");
				
		Response response = requestSpecification.request(Method.POST, "api/v1/create");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println("Posted the request");

	}

}
