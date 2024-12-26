package overriding;

class Bank
{
	
	double roi()
	{
		
		return 0;
	}
	
}

class icici extends Bank
{
	double roi()
	{
		
		return 10.5;
	}

}
class sbi extends Bank
{
	
	double roi()
	{
		
		return 8;
	}
}
public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bnk = new Bank();
icici ici = new icici();
sbi sb = new sbi();

System.out.println(bnk.roi());
System.out.println(ici.roi());
System.out.println(sb.roi());
	}

}
