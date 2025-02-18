import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class arrayexamples {
	
	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub
		
	int[] arr= new int[]{26, 3, 1, 56,12,2};
	Arrays.sort(arr);
	
	
	for (int i = 0; i < arr.length; i++)   
	{   
		
		
	System.out.println(arr[i]);   
	
	
	} 
	
	
	
	
	
	int count=0,currentInt=0;
    for (int i = 0; i < arr.length; i++)
    {
    currentInt = arr[i];
    count=0;

       for (int j = 0; j < arr.length; j++)
           {
             if (currentInt == arr[j])
                {
                  count++;
                 
                 }
            }
            System.out.println(arr[i]+" "+count);
      }
	}
}