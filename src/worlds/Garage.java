package worlds;

import java.util.List;

public class Garage 
{
	
	List cars = new ArrayList();
	//assertTrue(cars.isEmpty();

	public Garage() {
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
	}
	
	public void carOut(Vehicles x) {
		this.cars.remove(x);
	}
	public void emptyCars() {
	for (int i = 0; i < this.cars.size(); i++) {
		this.cars.remove(i);
	}
	}
}
