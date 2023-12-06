package Session_06;

import javax.xml.crypto.Data;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateJsonResponseBody {
	@Test
	public void UserListResponseBody() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.baseUri("https://reqres.in");
		requestSpecification.basePath("api/users?page=2");

		Response response = requestSpecification.get();

		ResponseBody responseBody = response.getBody();

		String responseString = responseBody.asString();

		JsonPath jsonPathview = responseBody.jsonPath();

		String firstName = jsonPathview.get("data[0].first_name");

		System.out.println("email address:" + jsonPathview.get("data[1].avatar"));

		Assert.assertEquals(firstName, "George", "Check for presense of firstname as George");

	}

}
