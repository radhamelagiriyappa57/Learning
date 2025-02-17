package Practice;

import java.util.ArrayList;
import java.util.List;

import com.aventstack.extentreports.gherkin.model.Given;

import PojoExample.addPlace;
import PojoExample.location;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ExtentReport.ExtentReportListener;
import Training.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
@Listeners(ExtentReport.ExtentReportListener.class)
public class serializeExample {
	
	@Test
	public void test1()
	{
		//addplace
		//json to object - deserialize
		//object to json - serialize
		
		
		RestAssured.baseURI="http://rahulshettyacademy.com";
		addPlace a = new addPlace();
		
		a.setAccuracy(50);
		a.setAddress("location");		
		a.setWebsite("www.url.com");
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		
		a.setTypes(mylist);
		
		
		
		
		location loc = new location();
		loc.setLat(34.5);
		loc.setLng(45.9);
		
		
		
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(a).when().post("/maps/api/place/add/json").then().assertThat().statusCode(301).extract().asString();
		System.out.println(response);
	}

}
