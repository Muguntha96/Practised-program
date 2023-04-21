package org.restassured.non_bdd.style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
		
	@Test
	public void put_request() {
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification = RestAssured.given()
				.header("contentType","application/json")
				.body("{\r\n"
						+ "        \"name\": \"Muguntha\",\r\n"
						+ "        \"salary\": \"10000\",\r\n"
						+ "        \"age\": \"20\"\r\n"
						+ "       \r\n"
						+ "    }");
		Response response=requestSpecification.request(Method.PUT,"api/v1/update/5671");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
		System.out.println("Update the information");
		
		
		
		

	}
}
