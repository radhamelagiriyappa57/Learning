
public class stringFun {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		
		//refers to the memory location where hello is stored
		
		String b = "hello";
		
		//checks if the memory has hello and refers to the same
		
		// when we say
		
		System.out.println(a==b);
		//checks if both are referring to same memory
		
		System.out.println(a.contentEquals(b));//Verifies the content
		//Immutable 
		
		//where as, String object creates new memory always 
		
		String s1= new String("hello");//true
		
		System.out.println(s1.equals(b));//true
		
		System.out.println(s1==b); //false
		
		System.out.println("*****************");  
		
		//we cannot assign anything directly on a string like a.replace
		
		String y = a.replace("h", "t");
		System.out.println(y);
		
		//String to be immutable
		
		StringBuffer s3= new StringBuffer("great");
		s3.replace(1, 2, "zz");
		System.out.println(s3);
		
		//replace string
		
		String str = "Few interviewers ask you same questions";
		
		
		
		System.out.println(str.replace("interviewers", "employee"));
		System.out.println(str.length());
		
		
		//change case
		
		
		
		
		
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		//check the content
		System.out.println(txt.contentEquals("Hello"));
		
		//convert case of each character
		
	
		
		
		String outputStr = "raDha";
		char[] ch=outputStr.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			char c= ch[i];
			if(Character.isUpperCase(c)) {
				
				ch[i]=Character.toLowerCase(c);
			}
			if(Character.isLowerCase(c)) {
				
				
				ch[i]=Character.toUpperCase(c);
			}
			
		}
		
		System.out.println(ch);
		//reverse string 
		
		String reverseStr="";
		for(int i = str.length()-1; i >= 0; i--){

			reverseStr = reverseStr + str.charAt(i);

			}
		System.out.println(reverseStr);
		
		
		
		
		
		//print occurence of each char in String
		 String str2="Reshma Raghunath Bangar";
		    int count=0;
		    
		    for(int i=0;i<str2.length();i++) {
		    
		        for(int j=i;j<str2.length();j++) {
		            if(str2.charAt(i)==str2.charAt(j)) {
		            count++;    
		            }else {
		                
		            }
		            //System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
		        }
		        System.out.println("Total number of count of occurance of "+str2.charAt(i)+" is "+count);
		    }
		    System.out.println(ch);
		    //////////////////
		    
		    int[] arr = new int[] {3, 1, 45, 2};
		    int arrcount=0; int temp=0;
		    for(int i=0; i<arr.length;i++)
		    {
		    	
		    	for (int j=i; j<arr.length; j++)
		    {
		    		
		    		if(arr[i]>arr[j])
		    		{
		    			temp=arr[i];
		    			arr[i]=arr[j];
		    					arr[j]=temp;
		    		}
		    		System.out.print(arr[i]+""+count);
		    }
		    }
		    
		//print each character in the string
		
		String p="This is my world";
		char[] ph = p.toCharArray();
		for(int j=0;j<ph.length;j++)
		{
			System.out.println(ph[j]);
			
		}
		
		
		
		//reverse string
		
		
	}

	
	//
	
}
