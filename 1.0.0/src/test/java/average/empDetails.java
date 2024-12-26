package average;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String department;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String department, double salary) {
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
}


public class empDetails {
	
	public static void main(String[] args) { 
		
		
		ArrayList<Employee> emplist = new ArrayList();
		emplist.add(new Employee("Radha", "HR", 2));
		emplist.add(new Employee("rishi", "HR", 1));
		emplist.add(new Employee("kuhu", "Admin",4));
		emplist.add(new Employee("kushi", "Admin",2));
		
		//emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		double avearge = emplist.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avearge);
		
		// TODO Auto-generated method stub
	}

}
