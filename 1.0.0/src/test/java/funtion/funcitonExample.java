package funtion;

import java.util.function.Function;

public class funcitonExample {
	
	
	public static void main(String[] args)
	{
		//funtion(data type, return type)
		Function<Integer, Integer>f=n->n*n;
		
		System.out.println(f.apply(2));
		System.out.println(f.apply(24444444));
		
		///ex2
		
		
		Function<String, Integer> f1=str->str.length();
		System.out.println(f1.apply("radha"));
		
		
		//ex3
		
		
		
		
		
		
	}
	

}
