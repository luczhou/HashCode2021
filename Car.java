package traffic;

import java.util.LinkedList;

public class Car {
	static int totalId = 1;
	
	String currentPos;
	int timeLeft;
	int id;
	LinkedList<String> streetsToTravel;
	
	
	public Car(String currentPos, int timeLeft){
		this.currentPos = currentPos;
		this.timeLeft = timeLeft;
		id = totalId++;
		streetsToTravel = new LinkedList<>();
	}
	
	public void addStreet(String street){
		streetsToTravel.add(street);
	}
	
}
