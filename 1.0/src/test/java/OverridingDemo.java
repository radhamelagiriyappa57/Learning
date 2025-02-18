class bank
{
	double roi()
	{
		return 0;
		
		
	}

}

class icici extends bank
{
	

	double roi()
	{
		return 10;
		
		
	}


}
class sbi extends bank
{
	

	double roi()
	{
		return 20;
		
		
	}


}
public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sbi s = new sbi();
		System.out.println(s.roi());
		
		icici c = new icici();
		System.out.println(c.roi());

	}

}
