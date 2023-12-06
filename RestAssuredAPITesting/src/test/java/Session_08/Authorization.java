package Session_08;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {

	@Test
	public void BasicAuth() {
		RequestSpecification requestSpec = RestAssured.given();

		// Specify URL
		requestSpec.baseUri("http://postman-echo.com");
		requestSpec.basePath("/basic-auth");

		// perform get request
		Response response = requestSpec.auth().preemptive().basic("postman", "password").get();

		// print status line
		System.out.println("Responsne status:" + response.statusLine());
		System.out.println("Response body:" + response.body().asString());

	}

	@Test
	public void DigestAuth() {
		RequestSpecification requestSpec = RestAssured.given();

		// Specify URL
		requestSpec.baseUri("http://httpbin.org");
		requestSpec.basePath("/digest-auth/undefined/prachi/prachi");

		// Provide correct credentials for Digest Authentication
		Response response = requestSpec.auth().digest("prachi", "prachi").get();

		Assert.assertEquals(response.statusCode(), 200, "Check for status code");

		// Print status line
		System.out.println("Digest Auth Response status: " + response.statusLine());
		System.out.println("Digest Auth Response body: " + response.body().asString());
	}

}