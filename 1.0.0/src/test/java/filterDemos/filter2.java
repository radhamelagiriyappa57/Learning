package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter2 {
	
	public static void main(String[] args) {

		
		
		List<String> names = Arrays.asList("Radha","rishi","kriti");
		
		List<String> longnames = new ArrayList<String>();
		
		longnames = names.stream().filter(str->(str.length()>5 && str.length()<8)).collect(Collectors.toList());
		
	//	List<String> longnames2 = names.stream().filter(str->(str.length()>5 && str.length()<8)).forEach(str->System.out.println(str));
		//names.stream().forEach(str->System.out.println(ch()));
		System.out.println(longnames);
		
	}

}
