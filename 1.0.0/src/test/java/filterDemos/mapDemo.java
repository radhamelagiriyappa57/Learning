package filterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapDemo {

	public static void main(String[] args) {
		
		
		List <String> vehicles = Arrays.asList("Bus", "car", "bicycle", "train");
		// TODO Auto-generated method stub
List <String> VehicleListinUpperCase = new ArrayList<String>();
//map - when you have to use the function
List VehicleListinUpperCase1=(List) vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
System.out.println(VehicleListinUpperCase1);
	}

}
