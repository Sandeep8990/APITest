package testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	
	@Test
	public void testRestService() {
		
		RestAssured.baseURI = ("https://reqres.in/");
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"api/users/2");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response dody "+ responseBody);
	}

}
