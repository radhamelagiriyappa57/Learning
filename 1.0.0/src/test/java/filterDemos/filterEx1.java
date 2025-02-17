package filterDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(215);
		numbersList.add(1230);
		numbersList.add(140);
		numbersList.add(150);
		numbersList.add(170);
		numbersList.add(190);
		
		List evno= numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.print("even no"+" "+evno);
		List oddno =numbersList.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.print("odd no"+" "+oddno);
		
		
		List prime = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.print("odd no"+" "+oddno);
		List nonprime = numbersList.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
List<Integer> even =		numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.print(even);

//List<Integer> even1 =		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
