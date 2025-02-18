
public class dynamicBindingexample {
	
	public static class parentclass
	{
		
		
		void print()
		{
			
			
			System.out.println("Parent is called");
		}
	}
	
	public static class childclass extends parentclass
	{
	@Override	void print()
		{
			
			
			System.out.println("child is called");
		}
		
	}
	
	public static void main(String[] args)
	{
		
		parentclass parent = new parentclass();
		parent.print();
		parentclass parent1 = new childclass();
		
		
	//	parent1.pri
		parent1.print();
		
		
		
	}

}
