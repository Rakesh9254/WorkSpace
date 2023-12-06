package Session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PatchMethod {

		@Test
		public void Test04() {
			JSONObject jsondata = new JSONObject();
			jsondata.put("Name", "Yadav");
			jsondata.put("Job", "Master");

			RestAssured.baseURI = "https://reqres.in/api/users/743";
			RestAssured.given().header("Content-type", "application/json").contentType(ContentType.JSON)
					.body(jsondata.toJSONString()).when().patch().then().statusCode(200).log().all();
		}

}
