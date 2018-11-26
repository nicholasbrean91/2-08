public class Vehicle {

	private static String _lPlateNum;
	private static String _colour;
	private static int _wheels;

	
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
}
