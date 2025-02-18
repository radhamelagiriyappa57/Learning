
public class polyexample {
	
	int a=10;
	int b=20;
	void sum()
	{
		
		System.out.println( a+b);
	}
	
	void sum(int a , int b)
	{
		
		System.out.println( a+b);
	}
	void sum(int a , double b)
	{
		
		System.out.println( a+b);
	}
	void sum(double b, int a)
	{
		
		System.out.println( a+b);
	}
	public static void main(String[] args) {
		
		polyexample p = new polyexample();
		p.sum();
		p.sum(33, 77);
		// TODO Auto-generated method stub

	}

}
