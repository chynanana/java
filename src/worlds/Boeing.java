package worlds;

public class Boeing extends Vehicles{

	boolean fly = true;
	
	
	
	public boolean isFly() {
		return fly;
	}



	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public int getCostOfService() {
		if(this.fly) {
			return 500; 
		} else {
			return 10;
		}
	}

	public Boeing() {
		super();
		super.setElectric(false);
		super.setNoDoors(8);
		super.setNoWheeles(10);
	}

}
