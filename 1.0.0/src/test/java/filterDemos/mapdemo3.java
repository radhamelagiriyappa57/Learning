package filterDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(2);
		numbersList.add(32);
		numbersList.add(233);
		numbersList.add(21);
		
List multi=		numbersList.stream().map(n->n*3).collect(Collectors.toList());
		
		System.out.print(multi);
		
	}

}
