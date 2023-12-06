package Session_04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse {
	@Test
	public void GetSingleUser() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.get();
		// get response code
		int responseCode = response.statusCode();

		Assert.assertEquals(responseCode, 200);
	}

}
