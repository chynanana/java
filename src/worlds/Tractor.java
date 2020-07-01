package worlds;

public class Tractor extends Vehicles{

	boolean bigEngine = true;
	
	
	
	public boolean isBigEngine() {
		return bigEngine;
	}



	public void setBigEngine(boolean bigEngine) {
		this.bigEngine = bigEngine;
	}

	public int getCostOfService() {
		if(this.bigEngine) {
			return 40; 
		} else {
			return 10;
		}
	}

	public Tractor() {
		super();
		super.setElectric(false);
		super.setNoWheeles(3);
		super.setNoDoors(2);
	}

}
