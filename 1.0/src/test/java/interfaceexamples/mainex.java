package interfaceexamples;

public class mainex {
	
	public static void main(String[] args) {
	
		bmw b = new bmw();
		b.start();
		b.stop();
		b.refuel();
		b.bmwrefuel();
		//car c= new car();
		
		car c = new bmw();
		c.start();
		c.stop();
		c.refuel();
		
		
	}

}
