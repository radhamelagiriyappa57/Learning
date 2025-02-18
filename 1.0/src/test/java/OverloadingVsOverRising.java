class abc
{
	
void m1(int a)
{
	
System.out.println(a);

}
void m2(int b)
{
	
System.out.println(b);

}
}

class xyz extends abc
{
	

	void m1(int a)//overriding
	{
		
	System.out.println(a*a);

	}
	void m2(int b, int c)//overloading
	{
		
	System.out.println(b+c);

	}

}
public class OverloadingVsOverRising {
	public static void main(String[] args) {
		
		xyz x = new xyz();
		x.m1(10);
		x.m2(2);
		x.m2(2, 0);
		
	}
	
	

}
