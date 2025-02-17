package average;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>
{
	
private String name;
private int id;
private int age;
public String getname()
{
return name;	

}

public void setname()
{
this.name=name;	
}

public int getage()
{
return age;	
}

public void setage()
{
	
this.age=age;
}
Student(String name, int id, int age)
{
	super();
this.name=name;
this.age=age;
this.id=id;

}

public int getid()
{
	return id;
	
}

public void setid()
{
	
this.id=id;

}

@Override
public String toString() {
	return name+" "+age+" "+id+" ";
}

@Override
public int compareTo(Student stu) {
	// TODO Auto-generated method stub
	return 0;
}

}
public class defaultSorting {

	public static void main(String[] args) {
		
		
		
		List<Student> stu=new ArrayList();
		stu.add(new Student("radha", 2334, 24));
		stu.add(new Student("Shiva", 455, 34));
		stu.add(new Student("Krishna", 955, 34));
		stu.add(new Student("Govind", 123, 34));
		Collections.sort(stu);
		System.out.println(stu);
		Collections.sort(stu, Comparator.comparing(Student::getage));
		System.out.println(stu);
		Collections.sort(stu, Comparator.comparing(Student::getid).thenComparing(Student::getage));
		
		System.out.println(stu);
	}

}
