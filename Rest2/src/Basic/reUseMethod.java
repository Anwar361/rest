package Basic;

import io.restassured.path.json.JsonPath;

public class reUseMethod {
	
	public static JsonPath rawToJason(String responce)
	{
		JsonPath js=new JsonPath(responce);
		return js;
	}

}
