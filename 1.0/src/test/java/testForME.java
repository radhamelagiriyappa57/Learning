import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class testForME {
	//Fibonacioo series
	public static void main(String[] args)
	{
		
		int n1=0, n2=1, n3;
		
		int count=10;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2; i<=count; i++)
		{
			
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
			
			
		}
		
		System.out.println("end");
		
		//array sort
		
		
		int[] arr= new int[]{1,23,2, 86, 8, 15};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
				{
				int temp=0;
				if(arr[i]>arr[j])
				{
					
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				}
			
			System.out.println(arr[i]);
		}
		
		System.out.println("end");
	
	//rotate array elements
	
	
	int[] ar = new int[] {4, 5, 2, 90,1};
	
	int n=3;
	for(int i=0; i<n; i++)
	{
		int last=ar.length-1;
		for(int j=ar.length-1; j>0; j--)
		{
			ar[i]=ar[j-1];
			
		}
		
		ar[0]=last;
		 
		
	}
	 for(int i = 0; i< ar.length; i++){    
         System.out.print(arr[i] + " ");    
     } 
	 
	 
	 //count occurence of each element
	 
	 int[] a= new int[] {3,5, 6,6, 8, 9,10};
	 
	 int currentint=0;
	 int count3=0;
	 for (int i=0; i<a.length;i++)
	 {
		 currentint=a[i];
		count=0;
		for(int j=0; j<a.length;j++)
		{
			
			if(currentint==a[j]);
			{
			count3++;}
		}
		System.out.println(a[i]+" "+count3);
		
	 }
	 
	 
	 String str="This is a new interview";
	 char[] ch=str.toCharArray();
	 for(int i=0; i<ch.length; i++)
	 {
		 char c=ch[i];
		 if(Character.isLowerCase(c))
		 {
			 ch[i]=Character.toUpperCase(c);
			 
		 }
		 
	 }
	 
	 HashMap<String , String> demo=new HashMap<String , String>();
	 demo.put("radha", "bangalore");
	 demo.put("rishi", "indore");
	 System.out.println(demo);
	 
	 
	
	 
	 for(Map.Entry<String, String> m1: demo.entrySet())
	 { 
	 System.out.println(m1.getKey()+" "+m1.getValue());
	 }
	 
	}
	
	
	
	
}
