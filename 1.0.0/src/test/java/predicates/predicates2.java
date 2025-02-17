package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;
//test
class Employee
{
	
String Ename;
int ESalary;
int EExperience;

Employee(String name, int salary, int Experience)
{

	Ename=name;
	ESalary=salary;
	EExperience=Experience;

}

}


public class predicates2 {

	public static void main(String[] args) {
		
		
		Employee emp =new Employee("radha", 2, 2);
		
	Predicate<Employee>	pr= e1 -> (e1.ESalary > 50 && e1.EExperience>10);
		System.out.println(pr.test(emp));
		
		//EX2
		
		ArrayList<Employee> a1= new ArrayList();
		a1.add(new Employee("hari", 20, 20)) ;
		a1.add(new Employee("shiv", 30, 20)) ;
		a1.add(new Employee("krish", 30, 20)) ;
		a1.add(new Employee("allen", 50, 20)) ;
		a1.add(new Employee("kannan", 70, 20)) ;
		
		for(Employee ey:a1)
		{
			
			Predicate<Employee>	pr2= ey1 -> (ey1.ESalary > 50 && ey1.EExperience>10);
			pr2.test(ey);
			System.out.println(ey.Ename+" "+ey.ESalary);
		}
	
		a1.stream().filter(pr = ey1 -> (ey1.ESalary > 50 && ey1.EExperience>10)).forEach(ey->System.out.println(ey.Ename+" "+ey.ESalary));

	}

}
