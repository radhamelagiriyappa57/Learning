package Day1;

public class student {
	
	int sid;
	String sname;
	char grad='B';
	
	void printdata()
	{
	System.out.println(sid+" "+sname+" "+grad+" ");
		
	}
	
	void setdata(int id, String s, char c)
	{
		sid = id;
		sname=s;
		grad=c;
		
	}
	student(int id, String s, char c)
	{
		sid = id;
		sname=s;
		grad=c;
		
	}
	
	student()
	{
		sid = 22;
		sname="tree";
		grad='A';
		
	}

}
