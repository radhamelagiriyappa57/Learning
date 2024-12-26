package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> vehicles = Arrays.asList("Bus", "car", "bicycle", "train");
		// TODO Auto-generated method stub
List <String> VehicleListinUpperCase = new ArrayList<String>();

vehicles.stream().map(str->str.length()).forEach(n->System.out.println(n));

	}

}
