import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collectionTypes {

	public static void main(String[] args) {
		
		
		
		// List - ArrayList, LinkedList and Treeset
		//list contains duplicates
		//list has sequence
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("radha");
		list1.add("rishi");
		list1.add("giri");
		list1.add("ratna");
		list1.add("guru");
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1.get(0));
		
		System.out.println(list1.get(22));		
		System.out.println(list1.contains("guru"));
		System.out.println(list1.indexOf(2));
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		
		list1.add("guru");
		list1.add("uma");
		list1.add("anu");
		list1.add("raji");
		list1.add("gayu");
		System.out.println(list1.subList(2, 5));
		
		
		//Set - HashSet, LinkedHAshset and Treeset
		//no duplicates
		//no sequence 
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("point1");
		hs.add("point2");
		hs.add("point3");
		hs.add("point4");
		hs.add("point5");
		hs.add("point6");
		hs.add("point1");
		hs.add("point8");
		
		hs.remove("point1");
		System.out.println(hs.isEmpty());
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			
			
			System.out.println(i.next());
		}
		
		//MAp - HashMap , TreeMap and LinkedHAshMAp
		//key and value pair
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		
		hm.put("Student1", 1);
		hm.put("Student2", 2);
		hm.put("Student3", 3);
		hm.put("Student4", 4);
		hm.put("Student5", 5);
		hm.put("Student6", 6);
		hm.put("Student7", 7);
		hm.put("Student1", 1);
		
		
		 for(Map.Entry<String, Integer> m1: hm.entrySet())
		 { 
		 System.out.println(m1.getKey()+" "+m1.getValue());
		 }
		 
		
hm.remove(3);System.out.println("*********************");


Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
ht.put("RadhaSalary", 233322);

ht.put("RishiSalary", 23333333);

ht.put("KushiSalary", 233331);
ht.put("KuhuSalary", 233322);

ht.put("GeethaSalary", 23333131);

ht.put("AnuSalary", 233332323);


for(Map.Entry<String, Integer> m2: ht.entrySet())
	
{
	
	 System.out.println(m2.getKey()+" "+m2.getValue());
}
//difference between hashmap and hashtable - multiple programs cannot access hasmap
//hashtable can be acceseed by multiple program
//hash map can have null and not hashtable


	}

}
