package interfaceexamples;

public interface car {
	
	//100% abstraction
	
	// no object of interface can be created
	//only final and static variables are created
	
	
	int wheels = 4;
	
	
	public abstract void start();
	public abstract void stop();
	public abstract void refuel();
	

}
