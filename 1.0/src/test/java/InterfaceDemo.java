
interface demo
{
	

	int length=10;//static and final
	int width=20;//static and final
	
	void circle();
	default void square()
	{
		
		System.out.println("square");
		
	}

}

public class InterfaceDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
