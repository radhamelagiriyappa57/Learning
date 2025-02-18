import java.util.HashMap;
import java.util.Map;

public class hashmapexample {
	

	public static void main(String[] args) {
	
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   
		   System.out.println("Initial list of elements: "+map);  
		   map.remove(2);
		   System.out.println("Initial list of elements: "+map);  
		   map.replace(1, "Guava");
		   System.out.println("Initial list of elements: "+map);  
		       
	}
}
