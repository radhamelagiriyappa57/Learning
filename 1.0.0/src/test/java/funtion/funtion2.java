package funtion;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	

String ename;
int salary;
Employee(String ename, Integer sal)
{
this.ename=ename;
this.salary=salary;
}


}
public class funtion2 {
	
	public static void main(String[] args)
	{
		ArrayList<Employee> emp= new ArrayList<Employee>();
		
		emp.add(new Employee("radha", 2344));
		emp.add(new Employee("rishi", 344242));
		
		Function<Employee,Integer> fn = e->{
			
			int sal=e.salary;

			
			if (sal>10 && sal<20000)					
				return (sal*10);
			else 
				return sal;
		};
		
		Predicate<Integer> p=p1->p1>5000;
		
		
			for(Employee em: emp)
			{
				int bonus=fn.apply(em);
				p.test(em.salary);
				System.out.println(em.ename+em.salary);
								
				
			}
		
			
			
		};
		
		
		
		
		
	}


