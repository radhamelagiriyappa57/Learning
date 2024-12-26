package consumerNsupplier;

import java.util.function.Consumer;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//consumer chaining
		
		
		Consumer<String> c1= s->System.out.println(s+" white");
		
		Consumer<String> c2= s->System.out.println(s+" green");
		
		Consumer<String> c3= s->System.out.println(s+" blue");
		
		c1.accept("rabbit");
		c2.accept("parrot");
		c3.accept("snake");
		
		
		c1.andThen(c2).andThen(c3).accept("rads");
		
		
		Consumer <String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("cow");
		
	}

}
