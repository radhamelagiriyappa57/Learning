package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(2);
		list1.add(23);	list1.add(28);
		
		List<Integer> result1= list1.stream().map(l->l+1).collect(Collectors.toList());
		
		
System.out.println(result1);
		List<Integer> result2= list1.stream().distinct().collect(Collectors.toList());
System.out.println(result2);
		List<Integer> result3= list1.stream().collect(Collectors.toList());


//flapmap

List<Integer> list2 = Arrays.asList(1, 2);
List<Integer> list3 = Arrays.asList(4, 6);
List<Integer> list4 = Arrays.asList(7, 9);
List<Integer> list5 = Arrays.asList(3, 8);
List<List<Integer>> finallist=Arrays.asList(list2,list3,list4,list5);


List result = finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());

System.out.println(result);
	
	
	//
List<String> list6 = Arrays.asList("radha", "geet");
List<String> list7 = Arrays.asList("rishi", "kuhu");
List<String> list8 = Arrays.asList("john", "kannan");
List<String> list9 = Arrays.asList("raji", "ben");
List<List<String>> finalstrings=Arrays.asList(list6,list7,list8,list9);

List resultString = finalstrings.stream().flatMap(f->f.stream()).distinct().collect(Collectors.toList());

System.out.println(resultString);
	
	
	
	}

}
