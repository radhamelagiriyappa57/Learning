package Practice;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PojoExample.programDetails;
import io.restassured.RestAssured;
import io.restassured.response.Response;
@Listeners(ExtentReport.ExtentReportListener.class)
public class programExample {

	//serialization - passing json as object
	
	@Test
	public void test1() {
		
		programDetails pinfo = new programDetails();
			pinfo.setOnline("true");
			pinfo.setProgramDescription("Intro to Sql by shu220");
			pinfo.setProgramId(9);
			pinfo.setProgramName("SQL220");
			RestAssured.baseURI="https://lms-program-rest-service.herokuapp.com/programs";
			Response res = given().log().all().auth().basic("admin","password")
			.header("Content-Type", "application/json")
			.body(pinfo)
			.when().post()
			.then().assertThat().statusCode(200).extract().response();
			String response = res.asString();
			System.out.println(response);
		
	}
	
	@Test
	public void test2() {
		
		
		
		
		//Deserialization
		programDetails pd = RestAssured.given().auth().basic("admin", "password").log().all()
		.when().get("https://lms-program-rest-service.herokuapp.com/programs").as(programDetails.class);
		
		
		//System.out.println("no of programs: "+ pd.length);
		System.out.println("Program Name: "+pd.getProgramName());
		System.out.println("Program Name: "+pd.getOnline());
		System.out.println("Program Name: "+pd.getProgramName());
		System.out.println("Program Description: "+pd.getProgramDescription());
	}
}
