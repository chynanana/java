package worlds;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	//public static void main(String[] args){

	private ArrayList<Vehicles> cars;
	
	//assertTrue(cars.isEmpty();
	//public static void main(String[] args){
	public Garage() {
		this.cars = new ArrayList<Vehicles>();
		// TODO Auto-generated constructor stub
	}

	public void carIn (Vehicles x) {
		this.cars.add(x);


	}

	public int billing() {
		int cost = 0;

		for (int i = 0; i < this.cars.size(); i++) {
			cost += this.cars.get(i).getCostOfService();
		}

		return cost;
	}

	public void carOutByID(int index) {
		this.cars.remove(index);
		System.out.println(index + "Has been removed");
	}

	public void carOut(Vehicles x) {
		this.cars.remove(x);
		System.out.println(x + "Has been removed");
	}
	
	public void emptyCars() {
		for (int i = 0; i < this.cars.size(); i++) {
			this.cars.remove(i);
			System.out.println("We have removed all cars from the garage");
		}
	}
	
	public void printAllCarsInGarage() {
		for (int i = 0; i < this.cars.size(); i++) {
			
			if (this.cars.get(i).toString().contains("Tesla")){
				System.out.println("OOH tesla");	
			}
			else {
			System.out.println(this.cars.get(i).toString());
			}
		}
	}
}
