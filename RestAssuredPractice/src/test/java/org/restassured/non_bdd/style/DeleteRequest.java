package org.restassured.non_bdd.style;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DeleteRequest {
	@Test
	public void delete_Request() {
		RestAssured.baseURI="https://dummy.restapiexample.com/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.DELETE,"api/v1/delete/2");
	System.out.println(response.getStatusCode());
	System.out.println("deleted the information");

	}
}
