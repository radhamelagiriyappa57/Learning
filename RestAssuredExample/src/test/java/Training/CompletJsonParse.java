package Training;

import io.restassured.path.json.JsonPath;

public class CompletJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JsonPath js = new JsonPath(Payload.CoursePrice());
		int count=	js.getInt("courses.size()");
		System.out.println(count);
		
		int amt =js.getInt("dashboard.purchaseAmount");
		
		System.out.println(amt);
		String cours1title = js.get("courses[0].title");
		System.out.println(cours1title); 
		
		for (int i=0;i<count;i++)
			
		{
			String Coursetitle = js.getString("courses["+i+"].title") ;
			System.out.println(Coursetitle);
			
			String Courseprice = js.getString("courses["+i+"].title").toString() ;
			System.out.println(Courseprice);
			
			
			
		}
		System.out.println("No of Copies by RPA");
		//
		for (int i=0;i<count;i++)
			
		{
			String Coursetitle = js.getString("courses["+i+"].title") ;
			
			if(Coursetitle.equalsIgnoreCase("RPA"));
			
			{
				int copiesrpa = js.get("courses["+i+"].copies");
				System.out.println(copiesrpa );
				
			}
			System.out.println(Coursetitle);
			
			
			String Courseprice = js.getString("courses["+i+"].title").toString() ;
			System.out.println(Courseprice);
			
			
			
		}
	}

}
