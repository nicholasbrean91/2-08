public class Vehicle {

	private static String _lPlateNum;
	private static String _colour;
	private static int _wheels;
	public static int speed = 0;

	
	public Vehicle (String lPlateNum,
					String colour,
					int wheels) {
		
		this._lPlateNum = lPlateNum;
		this._colour = colour;
		this._wheels = wheels;
		
	}
	
	public String lPlateNum(){
		return _lPlateNum;
	}
	public String colour(){
		return _colour;
	}
	public int wheels(){
		return _wheels;
	}
	
	public int accelerate(int increase) {
		int maxSpeed = 270;
		if(speed + increase < maxSpeed) {
			speed = speed + increase;
			return speed;
		}else {
			return -1;
		}
		
		
	}
	
	public int brake(int decrease, int speed) {
		if(speed - decrease >= 0) {
			return speed;
		}else {
			return -1;
		}
	}
	
	
}
