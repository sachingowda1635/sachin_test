package r_api;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PATCH {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification r = RestAssured.given();
		JSONObject obj = new JSONObject();
	
	r.contentType(ContentType.JSON);
	r.body(obj.toJSONString());

	Response res = r.request(Method.DELETE,"api/users/2");
	System.out.println(res.asString());
	int code = res.statusCode();
	System.out.println(code);

	}

}
