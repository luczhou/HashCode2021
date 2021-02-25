package traffic;

import java.util.*;

public class Intersection {
	Map<String, LinkedList<Integer>> cars;
	int num;
	
	public Intersection(int num){
		this.num = num;
		cars = new HashMap<>();
	}
	
	public void addStreet(String streetName){
		cars.put(streetName, new LinkedList<>());
	}
	public void addCar(int carId, String streetName){
		cars.get(streetName).add(carId);
	}
	
	
}
