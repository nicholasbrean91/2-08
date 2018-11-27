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
			System.out.println("Enter the speed you want to decrease from " + obj.accelerate(increase)  + ": ");
			int decrease = userInput.nextInt();
			
			if (obj.accelerate(increase) < 0) {
				System.out.println("You are not allowed to go that fast, the max is 270");
				System.exit(0);
			}
			
			if (obj.brake(decrease, obj.accelerate(increase)) == -1) {
				System.out.println("You are not allowed to go that slow, the lowest is 0");
				System.exit(0);
			}
			
			
			Truck truckObj = new Truck(lPlateNum, colour, numOfWheels, numOfDoors);
			System.out.println("-=-=-=Truck=-=-=-\nThe licience plate num is " + truckObj.lPlateNum() + 
								"\nThe colour of the car is " + truckObj.colour() + 
								"\nThe num of wheels is " +  truckObj.wheels() + 
								"\nThe # of doors the car has is " + truckObj.numOfDoors() + 
								"\nThe speed went from zero to " + obj.accelerate(increase) + 
								"\nThen you decreased from " + obj.accelerate(increase) + " to " + obj.brake(decrease, obj.accelerate(increase))  );
			
		}else {
			System.out.println("Please enter one of the following inputs 'bike' or 'truck'.");
			System.exit(0);
		}
	}
}
	

