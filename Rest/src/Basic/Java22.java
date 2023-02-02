package Basic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import AddPlace.Payload;

public class Java22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String responce=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.postPlace()).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		System.out.println(responce);
		JsonPath js=new JsonPath(responce);
		String place_id=js.getString("place_id");
		System.out.println(place_id);
				
		//addplace - update Place // get place - weather the place got updated
		String str2="7 Summer walk, USA";
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+place_id+"\",\r\n"
				+ "\"address\":\""+str2+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		
		// get place - weather the place got updated
		
		String resp=given().log().all().queryParam("key","qaclick123")
		.queryParam("place_id", place_id)
		.when().get("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(resp);
		
//		JsonPath js1=new JsonPath(resp);
//		String str1=js1.getString("name");
//		System.out.println(str1);


	}

}
