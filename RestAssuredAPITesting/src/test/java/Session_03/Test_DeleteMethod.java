package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_DeleteMethod {
	@Test
	public void Test05() {
		JSONObject jsondata = new JSONObject();
		jsondata.put("Name", "Roshan");
		jsondata.put("Job", "Teacher");

		RestAssured.baseURI = "https://reqres.in/api/users/743";
		RestAssured.given().when().delete().then().log().all().statusCode(204);
	}

}
