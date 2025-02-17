package Practice;
import io.restassured.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ExtentReport.ExtentReportListener.class)
public class basics {
	@Test
	public static void test()
	{
	//Add Place - Post
	
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=given().queryParam("key", "click123").header("Content-Type", "application/json")
	.body(Payload.AddPlace()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
	
	
	
	System.out.print(response);
	//
	JsonPath js = new JsonPath(response);
	String placeId=js.getString("place_id");
	System.out.print(placeId);
	
	String Updatedaddress="updated";
	//Put 
	given().log().all().queryParam("key", "click123").header("Content-Type", "application/json").body("{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"place_id\": \""+placeId+"\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \""+Updatedaddress+"\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}\r\n"
			+ "").when().put().then().assertThat().statusCode(200).body("msg", equalTo("Address updated successfully"));
	
	String response2 =given().log().all().queryParam("key", "click123").queryParam("place id", placeId).when().get("/maps/api/place/add/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
	
	JsonPath js2 = reusableMethods.rawTojson(response);
	String newAddress = js2.getString("address");
	System.out.print(js2.getString("address"));
	
	Assert.assertEquals(Updatedaddress, newAddress);
	
	
	}
	
}
