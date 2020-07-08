package worlds;

public class Vehicles {
	private int noWheeles=4;
	private int noDoors;
	private boolean electric;
	
	public Vehicles() {
		super();
		
	}

	public Vehicles(int noWheeles, int noDoors, boolean electric) {
		super();
		this.noWheeles = noWheeles;
		this.noDoors = noDoors;
		this.electric = electric;
	}

	public int getNoWheeles() {
		return noWheeles;
	}

	public void setNoWheeles(int noWheeles) {
		this.noWheeles = noWheeles;
	}

	public int getNoDoors() {
		return noDoors;
	}

	public void setNoDoors(int noDoors) {
		this.noDoors = noDoors;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
	public int getCostOfService() {
		return 10;
	}
	
}
