package Practice;

import Training.Payload;
import io.restassured.path.json.JsonPath;

public class completeJsonParseEx {
	public static void main(String[] args)
	{
		JsonPath js = reusableMethods.rawTojson(Payload.CoursePrice());
		//no of course
		int no = js.getInt("courses.size()");
		System.out.println(no);
		int pur = js.getInt("dashboard.purchaseAmount");
		
		System.out.println(pur);
		
		String course1title = js.getString("courses[0].title");
		System.out.println(course1title);
	
	
		String course2title = js.getString("courses[1].title");
		System.out.println(course2title);
		String course3title = js.getString("courses[2].title");
		System.out.println(course3title);
		
		
		for (int i=0;i<=no;i++)
		{
			int sum=0;
			String courseItitle = js.getString("courses["+i+"].title");
			System.out.println(courseItitle);
			int courseIprice = js.getInt("courses["+i+"].price");
			System.out.println(courseIprice);
			
			int courseICopies = js.getInt("courses["+i+"].copies");
			
			if(courseItitle.equalsIgnoreCase("RPA"))
			{
				
				String courseI2Copies = js.getString("courses["+i+"].copies");
				
				System.out.println("Copies sold by RPA is"+courseI2Copies);
				
			}
			
			int amount = courseIprice*courseIprice;
			System.out.println("Copies sold by RPA is"+amount);
			sum=sum+amount;
			System.out.println("sum sold by RPA is"+sum);
			
		}
	}
}
