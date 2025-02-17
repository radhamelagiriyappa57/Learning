package Practice;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import PojoExample.GetCourse;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class oAuthTest {

	@Test
	public void getcourse()
	{
		String response = 	given()
				.formParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
				.formParams("grant_type","client_credentials")
				.formParams("scope","trust")
				.when().log().all()
				.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
			
			System.out.println(response);
			JsonPath jsonPath = new JsonPath(response);
			String accessToken = jsonPath.getString("access_token");
			
	
			
			
			GetCourse gc = given().queryParam("access_token", accessToken).when().log().all().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourse.class);
			
			System.out.println(gc.getExpertise());
			
			System.out.println(gc.getInstructor());
			System.out.println(gc.getLinkedIn());
			System.out.println(gc.getServices());
			System.out.println(gc.getCourses().getapi().get(1).getCourseTitle());
			
			List apicourse=gc.getCourses().getapi();
			
			for (int i=0; i<gc.getCourses().getapi().size(); i++)
			{
				
				System.out.println(gc.getCourses().getapi().get(i).getCourseTitle());
				
				if(gc.getCourses().getapi().get(i).getCourseTitle().equalsIgnoreCase("soapUI Webservices testing"));
				{
					
					
					System.out.println(gc.getCourses().getapi().get(i).getPrice());
				}
			}
}
}
