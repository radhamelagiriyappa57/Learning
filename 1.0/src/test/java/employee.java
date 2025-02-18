import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employee {
	
	String name;
	int salary;
	
	void display()
	{
		
		System.out.println(name);
		System.out.println(salary);
		
	}
	
	employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	

public static class EmployeeDetails {
		
		
		
		public static void main(String[] args)
		{
			
			
			employee e1 = new employee("govind", 23232);
			
			
			e1.display();
			
			ArrayList<employee> emp = new ArrayList();
			emp.add(new employee("krishna", 8763872));
			emp.add(new employee("trihsna", 93298392));
			
		//	String avg = emp.stream().collect(Collectors.averagingInt(employee::getsalary));
			List l = emp.stream().collect(Collectors.toList());
			
			System.out.print(l);
		}

	}

	
}
