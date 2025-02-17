package lambaExamples;

import java.util.function.Predicate;

	public class predicateExample {
		
		
		public static void main(String args)
		{
			
			Predicate<Integer> p=i->(i>10);
			p.test(20);
			
			System.out.println(p);
			
		}

		
		
		
		
		
	}


