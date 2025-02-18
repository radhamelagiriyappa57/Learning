package staticNdynamicBinding;

class staticBindingExample {
	
	
	//It takes place at compile time for which is referred to as early binding
	//Since the print method of the superclass is static, the compiler knows that it will not be overridden in subclasses and hence compiler knows during compile time which print method to call and hence no ambiguity.
	//private, final and static members (methods and variables) use static binding 
	
	public static class superclass
	{
		
		static void print()
		{
			
			System.out.println("Superclass is called");
		}
		
		
	}
	
	public static class subclass extends superclass
	{
		
		static void print()
		{
			
			System.out.println("Subclass is called");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	superclass A=new superclass();
	A.print();
	superclass B = new subclass();
	B.print();
		

	}

}
