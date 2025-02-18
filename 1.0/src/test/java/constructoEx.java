import java.util.ArrayList;
import java.util.function.Consumer;



public class constructoEx {
	
	String name;
	int salary;
	
	constructoEx(String s , int salary)
	{
		this.name=s;
		this.salary=salary;
		
		
	}
	
	void display()
	{
		
		System.out.println(name);
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructoEx s1 = new constructoEx("radha", 23);
		s1.display();
		
		ArrayList<constructoEx> l1=new ArrayList<constructoEx>();
		l1.add(new constructoEx("rishi", 3232));
		l1.add(new constructoEx("Kuhu", 6681));
		l1.add(new constructoEx("Kushi", 3342));
		
		l1.stream().forEach(pr->System.out.println(pr.name));
		//using for loop
		
		for(constructoEx e:l1)
		{
			System.out.println(e.salary);
		}
		
	}
}
