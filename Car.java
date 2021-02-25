package traffic;

import java.util.LinkedList;

public class Car {
	String currentPos;
	int timeLeft;
	LinkedList<String> streetsToTravel;
	
	public Car(String currentPos, int timeLeft){
		this.currentPos = currentPos;
		this.timeLeft = timeLeft;
		streetsToTravel = new LinkedList<>();
	}
	
	public void addStreet(String street){
		streetsToTravel.add(street);
	}
	
}
