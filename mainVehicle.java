import java.util.Scanner;
public class mainVehicle {
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		String lPlateNum;
		String colour;
		int wheels;
		int numOfDoors;
		
		System.out.println("Please enter your desired vechicle between 'bike' and 'truck'");
		String vehicleChoice = userInput.nextLine();
		
		if (vehicleChoice.equals("bike")) {
			
			System.out.println("Enter the Licence Plate Number you would like: ");
			lPlateNum = userInput.nextLine();
			System.out.println("Enter the Colour of Vehicle you would like: ");
			colour = userInput.nextLine();
			wheels = 2;
			
			//Vehicle obj = new Vehicle(lPlateNum, colour, wheels); 
			
			//System.out.println("-=-=-=Bike=-=-=-\nThe licience plate num is " + obj.lPlateNum() + "\nThe colour of the bike is " + obj.colour() + "\nThe num of wheels is " +  obj.wheels() );
			
			Bike bikeObj = new Bike(lPlateNum, colour, wheels);
			System.out.println("-=-=-=Bike=-=-=-\nThe licience plate num is " + bikeObj.lPlateNum() + "\nThe colour of the bike is " + bikeObj.colour() + "\nThe num of wheels is " +  bikeObj.wheels() );
			
		}else if(vehicleChoice.equals("truck")) {
			
			System.out.println("Enter the Licence Plate Number you would like: ");
			lPlateNum = userInput.nextLine();
			System.out.println("Enter the Colour of Vehicle you would like: ");
			colour = userInput.nextLine();
			System.out.println("Enter the number of Wheels you would like your car to have: ");
			wheels = userInput.nextInt();
			System.out.println("Enter the number of Doors you would like your car to have: ");
			numOfDoors = userInput.nextInt();
			
			Vehicle obj = new Vehicle(lPlateNum, colour, wheels);
			int numOfWheels = obj.wheels();
			
			System.out.println("Enter the speed you want to increase from 0: ");
			int increase = userInput.nextInt();
			
			int increasedValue = obj.accelerate(increase);
			
			System.out.println("Enter the speed you want to decrease from " + increasedValue + ": ");
			int decrease = userInput.nextInt();
			
			if (increasedValue < 0) {
				System.out.println("You are not allowed to go that fast, the max is 270");
				System.exit(0);
			}
			
			
			int breakedSpeed = obj.brake(decrease, increasedValue);
			
			
			Truck truckObj = new Truck(lPlateNum, colour, numOfWheels, numOfDoors);
			System.out.println("-=-=-=Truck=-=-=-\nThe licience plate num is " + truckObj.lPlateNum() + 
								"\nThe colour of the car is " + truckObj.colour() + 
								"\nThe num of wheels is " +  truckObj.wheels() + 
								"\nThe # of doors the car has is " + truckObj.numOfDoors() + 
								"\nThe speed went from 0 to " + increasedValue + 
								"\nThen you decreased from " + increasedValue + " to " + breakedSpeed  );
			
		}else {
			System.out.println("Please enter one of the following inputs 'bike' or 'truck'.");
			System.exit(0);
		}
	}
}
	
