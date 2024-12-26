
@FunctionalInterface
interface cab
	{
		
		public void bookcab(String source, String destination);
	}


public class lambdaExamples {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
cab c = (source, destination)->System.out.println("hello"+source+"and"+destination+"");
c.bookcab("delhi", "bangalore");
		

	}

	
}
