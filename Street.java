package traffic;

public class Street {
	String name;
	int timeToCross;
	int start;
	int finish;
	
	public Street(String name, int start, int finish, int timeToCross){
		this.name = name;
		this.timeToCross = timeToCross;
		this.start = start;
		this.finish = finish;
	}	
	
	public String getName(){
		return name;
	}
}
