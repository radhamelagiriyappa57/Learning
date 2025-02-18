
class demoInt
{
void print(int x)
{
	System.out.println(x);
}
}

public class intExamples {

	public static void main(String[] args) {
		
		
		demoInt d= new demoInt();
		d.print((int) 12.9);
		System.out.println("************************************");
		
		
		
		int n1=0; int n2=1; int count =10;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=2; i<count; i++)
		
		{
			
			int n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

	

}
