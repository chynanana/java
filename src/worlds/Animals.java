package worlds;

public class Animals {
	
	private int numLegs;
	private boolean canFly;
	private String pattern;
	
	public Animals() {
	}

	public Animals(int numLegs, boolean canFly, String pattern) {
		this.numLegs = numLegs;
		this.canFly = canFly;
		this.pattern = pattern;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public void getData() {
		System.out.println("I have " + this.numLegs + " legs");
		System.out.println("I can fly, that is  " + this.canFly);
		System.out.println("My pattern is " + this.pattern);
	}
	

	
}