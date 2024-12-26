package Training;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class HTTPRequests {
	int id;
	@Test(priority=1)
	//Run | Debug
	void getUser()
	{
		 given()		
		.when()
			.get("https://reqres.in/api/users?page=2")		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
		
	}
	@Test(priority=2)
	void createuser()
	{
		
		HashMap hm = new HashMap();
		hm.put("name", "radha");
		hm.put("job", "sst");	
	
		id=given()
				.contentType("application/json")
				.body(hm)	
	.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
	/*.then()
	.statusCode(200)
	.body("page",equalTo(2))
	.log().all();
	
	*/
	}
	
	@Test(priority=3,dependsOnMethods = {"createuser"})
	void updateuser()
	{
		
		HashMap hm = new HashMap();
		hm.put("name", "kuhu");
		hm.put("job", "sst");
			
	given()
		.contentType("application/json")
		.body(hm)
	
	.when()
		.put("https://reqres.in/api/users/"+id)
	
	
	.then()
		.statusCode(200)	
		.log().all();
	
	}
	@Test(priority=4)
	void deleteuser()
	{
		
		
	given()
	
	
	.when()
	.delete("https://reqres.in/api/users/"+id)
	
	
	.then()
	.statusCode(204)
	.log().all();
	
	}
	
	@Test(priority=5)
	void createuserUsingJsonObject()
	{
		
		JSONObject hm = new JSONObject();
		hm.put("name", "rishi");
		hm.put("job", "pm");	
	
		id=given()
				.contentType("application/json")
				.body(hm.toString())	
	.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
	/*.then()
	.statusCode(200)
	.body("page",equalTo(2))
	.log().all();
	
	*/
	}
	
}
