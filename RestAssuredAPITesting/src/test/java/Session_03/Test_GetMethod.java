package Session_03;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GetMethod {
	@Test
	public void Test01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println("Status Code is: " + response.getStatusCode());
		System.out.println("Response Body is: " + response.getBody().asString());
		System.out.println("Response Time is: " + response.getTime());
		System.out.println("Response Header is: " + response.getHeader("Content-Type"));

		// Validate Status Code
		int ActualStatusCode = response.getStatusCode();
		int ExpectedStatusCode = 200;

		Assert.assertEquals(ExpectedStatusCode, ActualStatusCode);

	}

	@Test
	public void Test02() {
		// Given,when,then
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().queryParam("page", "2").when().get().then().statusCode(200);
	}

}
