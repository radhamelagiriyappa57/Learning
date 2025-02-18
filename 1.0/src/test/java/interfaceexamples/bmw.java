package interfaceexamples;

public class bmw implements car {

	@Override
	public void start() {
System.out.println("bmw start");		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("bmw stop");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("bmw refuel");
	}
	
	
	public void bmwrefuel() {
		// TODO Auto-generated method stub
		System.out.println("bmw refuel from bmw");
	}
}
