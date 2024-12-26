package filterDemos;

import java.util.ArrayList;
import java.util.List;

class product
{
String name;
int id;
double price;

product(String name, int id, double price)
{
this.id=id;
this.name=name;
this.price=price;

}
}

public class filter4 {
	
	
	public static void main(String[] args) {
		
		
		List<product> result = new ArrayList<product>();
		result.add(new product("dell", 2, 4));
		result.add(new product("lenovo", 3, 5));
		result.add(new product("HP", 6, 5));
		
		List<product> answer = new ArrayList<product>();
result.stream().filter(p->p.price>1).forEach(pr->System.out.println(pr.price));
		
	}
	}


