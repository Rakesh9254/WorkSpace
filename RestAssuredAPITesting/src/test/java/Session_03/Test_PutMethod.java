package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PutMethod {
	@Test
	public void Test04() {
		JSONObject jsondata = new JSONObject();
		jsondata.put("Name", "Roshan");
		jsondata.put("Job", "Teacher");

		RestAssured.baseURI = "https://reqres.in/api/users/743";
		RestAssured.given().header("Content-type", "application/json").contentType(ContentType.JSON)
				.body(jsondata.toJSONString()).when().put().then().statusCode(200).log().all();
	}

}
