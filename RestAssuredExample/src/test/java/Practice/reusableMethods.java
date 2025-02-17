package Practice;

import io.restassured.path.json.JsonPath;

public class reusableMethods {
public static JsonPath rawTojson(String response)
{
	JsonPath js= new JsonPath(response);
	return js;

}
}
