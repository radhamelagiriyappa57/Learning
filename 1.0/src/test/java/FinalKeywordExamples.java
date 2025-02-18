class test{
	
	int a = 100;
	final int b=40;
	
	final void m1()
	{
		
		System.out.println("from test");
		
	}
	void m3()
	{
		
		System.out.println("m3 from parent");
		
	}
	
}

class test2 extends test
{
	
	/*void m1()
	{
		
		System.out.println("from test2");
		
	}
	*/
	
	int a=20;
	void m2()
	{
		
		System.out.println(super.a);
		
		
	}
	
	void m3()
	{
		
		super.m3();
		
	}
}

public class FinalKeywordExamples {
	
	
	public static void main(String[] args) {
		
		
	test t= new test();
	
	t.a=200;
	System.out.println(t.a);
	test2 t2= new test2();
	t2.m2();
		t2.m3();
	//	t.b=300;//cannot change it
		
		
	}

}
