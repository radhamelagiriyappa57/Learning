package average;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
	
	private String name;
	private String department;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class empDetails {
	
	public static void main(String[] args) { 
		
		
		
		List<Employee> emplist = new ArrayList();
		emplist.add(new Employee("Radha", "HR", 2));
		emplist.add(new Employee("Rishi", "HR", 1));
		emplist.add(new Employee("Kuhu", "Admin",4));
		emplist.add(new Employee("Kushi", "Admin",2));
		
		//emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		double avearge = emplist.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		
		
		
		System.out.println(avearge);
		
//Collections.sort(emplist);
		
		Collections.sort(emplist, Comparator.comparing(Employee::getName).thenComparingInt(Employee::getSalary));
		//Collections.sort(emplist);
        System.out.println(emplist);
		
		

		
		// TODO Auto-generated method stub
	}

}
