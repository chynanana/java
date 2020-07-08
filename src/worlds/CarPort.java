package worlds;

import java.util.List;

public class CarPort{
//things need to be here attributes of class
	//public Garage MyGarage;
	//public Vehicles MyCar;
	//public Tesla MyElectricCar;
	
	//// below this is the function 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * this.MyGarage = new Garage();
		 * 
		 * // this is allowed this.MyCar = new Tesla();
		 * 
		 * // this is also allowed this.MyCar = new Tractor();
		 * 
		 * // this is allowed this.MyElectricCar = new Tesla();
		 * 
		 * // this is NOT allowed this.MyElectricCar = new Tractor();
		 */
		Garage myGarage = new Garage();
		
		Tesla myTesla = new Tesla();
		Tractor myTractor = new Tractor();
		Boeing myPlane = new Boeing();
		
		myGarage.carIn(myTesla);
		myGarage.carIn(myTractor);
		myGarage.carIn(myPlane);
		
		myGarage.printAllCarsInGarage();

	}
//you need setters and getters if your objects have properties that need to be collected 
// good for error checking 
	public CarPort(Garage myGarage) {
		super();
		MyGarage = myGarage;
	}

	
	

}
