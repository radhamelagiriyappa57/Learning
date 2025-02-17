package Practice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ExtentReport.ExtentReportListener;
import Training.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
@Listeners(ExtentReport.ExtentReportListener.class)
public class DynamicJson {

	@Test(dataProvider="getData")
	public void addbook(String s, String y)
	{
		
		
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().header("Content-Type", "application/json").body(Payload.addbook(s, y)).when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js =reusableMethods.rawTojson(response);
		String id=js.getString("ID");
		System.out.print(id);
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		
		String Data[][] = {
				
				{"toad", "332"}, {"load", "3732"}
				
		};
		
		
		return Data;
	}
	}


