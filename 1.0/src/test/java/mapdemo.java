import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class mapdemo {
	
	public static void main(String[] args) 
	{
		
		HashMap m = new HashMap();
		m.put("radha", 22);
		m.put("Geetha", 22);
		m.put("rashmi", 22);
		m.put("allen", 22);
		m.put("kannan", 22);
		m.put("rishi", 22);
		m.put("joy", 22);
		
		System.out.println(m);
		m.replace("radha", 34);
		m.remove("joy");
		System.out.println(m);
		
		

	}

}
