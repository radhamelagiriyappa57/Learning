import java.util.Arrays;

public class interviewex {

	public static void main(String[] args) {
		
		int[] arr=new int[] {98,77,66,44,2};
		Arrays.sort(arr);
		System.out.println();
		
	
	
	
	
	//count occurences
	
	
	int count=0;
	int currentint=0;
	
	for (int i=0;i<arr.length;i++)
	{
		currentint = arr[i];
		
		for(int j=0; j<arr.length;j++)
		{
			if(currentint==arr[j])
			{
				count++;
			}
			
		}
		
		System.out.println(arr[i]);
	}
	
	
	int n=0;
	for(int i=0; i<n;i++)
	{
		
		int last=arr[arr.length-1];
		for(int j=arr.length-1; j>0; j--)
		{
			
			arr[i]=arr[j-1];
			
		}
		
		arr[0]=last;
		
		
		
		
		
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}
