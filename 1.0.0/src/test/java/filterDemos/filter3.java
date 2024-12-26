package filterDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filter3 {

	public static void main(String[] args) {
		
		
		ArrayList<String> words = new ArrayList();
		words.add("book");
		words.add(null);
		words.add("geet");
		// TODO Auto-generated method stub
		
		List<String> result= new ArrayList();
		result= words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(result);

	}

}
