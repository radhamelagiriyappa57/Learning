package predicates;
import java.util.function.Predicate;

public class predicateExample {
	
	
	public static void main(String[] args) {
	{
		
		Predicate<Integer> p=i->(i>10);
		
		
		System.out.println(p.test(20));
		
		
		//ex2
		
		Predicate<String> p1 = str->(str.length()>4);
		System.out.println(p1.test("radha"));
		System.out.println(p1.test("sar"));
		
		//ex3
		
		String[] names = {"radha", "rishi", "smi", "john"};
		
		
				for(String name: names)
				{
					Predicate<String> p2 = str->(str.length()>4);
					if (p2.test(name))
					{
						
						System.out.println(name);
						
					}
					
					
				}
				
				
				//ex4
				
				
				
				
				
		
		
		
		
	}

	
	}
	
	
	
}
