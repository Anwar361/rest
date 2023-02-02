package Basic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AddPlace.Payload;

public class Java1 {

	@Test(dataProvider="getData")
	public void addBook(String aisle,String isbn)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String adBook =given().log().all().header("Content-Type","application/json")
		.body(Payload.addBook(aisle,isbn)).when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(adBook);
		
		JsonPath js=reUseMethod.rawToJason(adBook);
		String id=js.getString("ID");
		System.out.println(id);
		
	}
	
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		return new Object[][] {{"bbb","789"},{"ccc","456"},{"ddd","678"}};
	}
}
