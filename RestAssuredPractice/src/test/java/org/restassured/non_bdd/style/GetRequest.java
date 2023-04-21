package org.restassured.non_bdd.style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	@Test
	public void get_req() {
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"/api/v1/employees/1");
		System.out.println(response.getStatusCode());
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
		System.out.println("Got the employee information");
	}

}
