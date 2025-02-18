



public class staticBindingExample {
	
public static class superclass{
		
		
		static void print()
		{
			
			System.out.println("print() in superclass is called");
		}
	}
	
	public static class subclass extends superclass{
		
		static void print()
		{
			
			 System.out.println(
		                "print() in subclass is called");
		}
	}
	
	
	
	 public static void main(String[] args)
	    {
		superclass A = new superclass();
		
		
		
		A.print();
		
		subclass s = new subclass();
		s.print();
		
		superclass B= new subclass();
		
		B.print();
	}
	
	
}
