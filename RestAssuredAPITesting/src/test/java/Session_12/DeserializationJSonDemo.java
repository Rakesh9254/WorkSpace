package Session_12;

import org.json.simple.JSONObject;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DeserializationJSonDemo{

@Test
public void createUser() {
    // https://reqres.in/api/users
    // create Request Specification
    RequestSpecification requestSpec = RestAssured.given();

    // specify URL
    requestSpec.baseUri("https://reqres.in");
    requestSpec.basePath("/api/users");

    // create request body
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "Prachi");
    jsonData.put("job", "QA");

    // perform post request
    Response response = requestSpec.contentType(ContentType.JSON)
            .body(jsonData.toJSONString())
            .post();

    ResponseBody responseBody = response.getBody();

    // Deserialize responseBody i.e json response body to class object
    JSONPostRequestResponse responseClass = responseBody.as(JSONPostRequestResponse.class);

    // Assert the values without extra spaces
    AssertJUnit.assertEquals(responseClass.name, "Prachi", "check for name.");
    AssertJUnit.assertEquals(responseClass.job, "QA", "check for QA.");
}
}