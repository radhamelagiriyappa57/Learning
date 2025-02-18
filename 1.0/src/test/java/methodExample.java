
public class methodExample {
	
	
	
	//no param and no return
	
	void m1()
	{
		System.out.println("hello");
		
	}
	
	//no param and return value
	String m2()
	{
		return("welcome");
		
	}
	
	// param and no return value
	void m3(String s)
	{
		System.out.println(s);
		
	}
	
	// param and return value
	String m4(String s)
	{
		String p = s.substring(2, 5);
		return p;
		
	}
	
	
}
