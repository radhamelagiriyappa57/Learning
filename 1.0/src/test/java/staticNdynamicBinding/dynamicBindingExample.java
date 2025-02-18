package staticNdynamicBinding;

import staticNdynamicBinding.staticBindingExample.subclass;
import staticNdynamicBinding.staticBindingExample.superclass;

public class dynamicBindingExample {
	
	//It takes place at runtime so do it is referred to as late binding.  
	//During compilation, the compiler has no idea as to which print has to be called since the compiler goes only by referencing variable. And therefore the binding would be delayed to runtime and therefore the corresponding version of the print will be called based on type on an object.
	
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
