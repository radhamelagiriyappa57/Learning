package Day1;

public class Employee {
	
	public int eid;
	public String ename;
	public String job;
	public int sal;
	
	public void display()
	{
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);

		
	}

	public static void main(String[] args) {
		
Employee emp1 = new Employee();
emp1.eid = 123;
emp1.ename = "radha";
emp1.job= "tl";
emp1.sal=10;
emp1.display();
Employee emp2 = new Employee();
emp2.eid = 1234;
emp2.ename = "radha";
emp2.job= "tl";
emp2.sal=10;
emp2.display();

		// TODO Auto-generated method stub

		
		
		
	}
	
	

}
