package consumerNsupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	
String ename;
int salary;
String gender;

Employee(String ename, int salary, String gender)
{
this.gender=gender;
this.ename=ename;
this.salary=salary;

}
}
public class ex2 {
	
	public static void main(String[] args) {
		
		ArrayList <Employee> emplist= new ArrayList<Employee> ();
		
		emplist.add(new Employee("radha", 2777, "male"));
		emplist.add(new Employee("rishi", 2666, "male"));
		emplist.add(new Employee("kushi", 23333, "male"));
		emplist.add(new Employee("kuhu", 222222, "male"));
		
		//function
		Function<Employee, Integer> f=emp->(emp.salary*10)/100;
		
		//predicate
		Predicate<Integer> p = b->b>5000;
		
		//Consumer
		Consumer<Employee> c = emp->{
			
			System.out.println(emp.ename);
			System.out.println(emp.gender);
			System.out.println(emp.salary);
			
			
		};
		
		for(Employee e:emplist)
		{
			int bonus = f.apply(e);//function
		if(p.test(bonus))//predicate
		{
			
			c.accept(e);//invoke consumer
			System.out.println(bonus);
			
		}
		
			
		}
	}

}
