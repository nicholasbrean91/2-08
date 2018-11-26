
public class Truck extends Vehicle {

	private static int _numOfDoors;
	
	public Truck(String lPlateNum, 
				 String colour, 
				 int wheels,
				 int numOfDoors) {
		
		super(lPlateNum, colour, wheels);
		this._numOfDoors = numOfDoors;
	}
	
	public int numOfDoors() {
		return _numOfDoors;
	}
	
	
}
