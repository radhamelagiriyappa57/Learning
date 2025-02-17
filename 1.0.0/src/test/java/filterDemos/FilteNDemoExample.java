package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	String empname;
	int salary;
	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	


}

public class FilteNDemoExample {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(23,"radh", 2324));
		emp.add(new Employee(232,"rish", 1234));
		emp.add(new Employee(236,"kuhu", 9234));
				
		emp.add(new Employee(223,"kushi", 2734));
		
		
	List<Integer> result = emp.stream().filter(e->e.salary>20).map(e->e.salary).collect(Collectors.toList());
	
	System.out.print(result);
	

	emp.stream().sorted().forEach(System.out::println);
	
	}

}
