package traffic;

import java.util.*;

public class Intersection {
	Map<String, Street> streets;
	int num;
	
	public Intersection(int num){
		this.num = num;
		streets = new HashMap<>();
	}
	
	public void addStreet(Street street){
		streets.put(street.getName(), street);
	}
	
	
}
