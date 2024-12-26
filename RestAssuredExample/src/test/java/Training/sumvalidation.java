package Training;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class sumvalidation {
	
	
	@Test
	public void sumvalidation()
	{
		int sum=0;
		
		JsonPath js = new JsonPath(Payload.CoursePrice());
		int count = js.getInt("courses.size()");
		for (int i=0;i<count;i++)
			
		{
			
			
			int price = js.get("courses["+i+"].price");
			int copies =  js.get("courses["+i+"].copies");
			int amt = price*copies;
			System.out.println(amt);
			sum=sum+amt;
			System.out.println(sum);
			
		}
	
		if (sum== js.getInt("dashboard.purchaseAmount"))
		{
			System.out.println("equal");
		}
		System.out.println("not equal");
		
		Assert.assertEquals(sum, js.getInt("dashboard.purchaseAmount"));
	
	}
	
	
	

}
