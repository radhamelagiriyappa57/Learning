package funtion;

import java.util.function.Function;

public class function3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f1= i->i*10;
		Function<Integer, Integer> f2= j->j*20;
		
		//f1.apply(2);
		//f2.apply(9);
		
	System.out.print(f1.andThen(f2).apply(2));
	}

}
