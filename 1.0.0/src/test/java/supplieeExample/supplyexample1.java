package supplieeExample;

import java.util.Date;
import java.util.function.Supplier;

public class supplyexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<Date> s=()->new Date();
		
		System.out.println(s.get());
		
		/*
		 * Predicate<T>
		 * Function<T, R>
		 * Consumer<T>
		 * Supplier<R>
		 * 
		 * t - input
		 * r - return type
		 */
		
		

	}

}
