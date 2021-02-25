package traffic;

import java.io.File;
import java.util.*;

public class Simulation {
	int totalTime;
	int destinationPoints;
	Map<Integer, Car> cars = new HashMap<Integer, Car>();
	Map<String, Street> streets = new HashMap<String, Street>();
	Map<Integer, Intersection> intersections = new HashMap<Integer, Intersection>();
	
	public static void main(String[] args){
		File text = new File("C:/Users/Public/Joy/HashCode/a.txt");
		Scanner input = new Scanner(text);
		
		int numTime = input.nextInt();
		int numIntersections = input.nextInt();
		int numStreets = input.nextInt();
		int numCars = input.nextInt();
		
		input.next();
		
		
		int start, end, seconds;
		String street;
		for (int i = 0; i < numStreets; i++) {
			start = input.nextInt();
			end = input.nextInt();
			street = input.next();
			seconds = input.nextInt();
			
			System.out.println(start);
			System.out.println(end);
			System.out.println(street);
			System.out.println(seconds);
		}

		int numStreetInPath;
		String street_path;
		for (int i = 0; i < numCars; i++) {
			numStreetInPath = input.nextInt();
			System.out.println(numStreetInPath);
			
			for (int j = 0; j < numStreetInPath; j++) {
				street_path = input.next();
				System.out.println(street_path);
			}
		}
	}
}
