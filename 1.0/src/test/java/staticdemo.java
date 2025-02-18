
public class staticdemo {

	
	
	static int a=10;
	int b=20;
	static void m1()
	{
		
		System.out.println("static method");
		
	}
	
	void m2()
{
		
		System.out.println("non static method");
		
	}
	public static void main(String[] args) {
		
		staticdemo s = new staticdemo();
		s.m2();
		m1();
		
		System.out.println(s.b+45);
	
	}
}
