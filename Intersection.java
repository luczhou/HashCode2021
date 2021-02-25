package traffic;

import java.util.*;

public class Intersection {
	Set<Car> cars;
	Map<String, Street> streets;
	int num;
	
	public Intersection(int num){
		this.num = num;
		streets = new HashMap<>();
		cars = new HashSet<Car>();
	}
	
	public void addStreet(Street street){
		streets.put(street.getName(), street);
	}
	
	
}
