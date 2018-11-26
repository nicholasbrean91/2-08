//Created By Nicholas Brean
//Created on Nov 2018
//Created to return the # wheels in various classes using Inheritance.

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
			
			Truck truckObj = new Truck(lPlateNum, colour, numOfWheels, numOfDoors);
			System.out.println("-=-=-=Truck=-=-=-\nThe licience plate num is " + truckObj.lPlateNum() + "\nThe colour of the car is " + truckObj.colour() + "\nThe num of wheels is " +  truckObj.wheels() + "\nThe # of doors the car has is " + truckObj.numOfDoors()  );
			
		}else {
			System.out.println("Please enter one of the following inputs 'bike' or 'truck'.");
			System.exit(0);
		}
	}
}
	

