package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class student
{
	
String sname;
int sid;
char grade;

student(String sname, int sid, char grade)
{
	this.grade=grade;
	this.sname=sname;
	this.grade=grade;
}

}
public class studentdemo {
	public static void main(String[] args) {
		
		
		List<student> stuList1= new ArrayList<student>();
		
		stuList1.add(new student("radha", 23, 'A'));
		stuList1.add(new student("kannan", 223, 'C'));
		stuList1.add(new student("Allen", 13, 'B'));
		stuList1.add(new student("Shiv", 233, 'J'));
		stuList1.add(new student("Roshan", 23, 'A'));

List<student> stuList2= new ArrayList<student>();
		
		stuList2.add(new student("naveen", 23, 'A'));
		stuList2.add(new student("pet", 223, 'C'));
		stuList2.add(new student("rr", 13, 'B'));
		stuList2.add(new student("hai", 233, 'J'));
		stuList2.add(new student("tey", 23, 'A'));
		
		
		List<List<student>> finalList =Arrays.asList(stuList1, stuList2);
		List result = finalList.stream().flatMap(x->x.stream()).map(s->s.sname).collect(Collectors.toList());

		System.out.println(result);
		
		
	}
	}


