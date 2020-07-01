package worlds;

public class Tesla extends Vehicles{
	
	boolean seatHeat = true;
	
	
	public boolean isSeatHeat() {
		return seatHeat;
	}


	public void setSeatHeat(boolean seatHeat) {
		this.seatHeat = seatHeat;
	}

	public int getCostOfService() {
		if(this.seatHeat) {
			return 50; 
		} else {
			return 10;
		}
	}
	
	public Tesla() {
		super();
		super.setElectric (true);
		super.setNoDoors(5);
		super.setNoWheeles(4);
		
	}

}