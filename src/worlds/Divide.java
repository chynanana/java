package worlds;

public abstract class Divide {

	private int ono = 0;
	private int due = 0;

	public Divide() {}

	public Divide(int ono, int due) {
		this.setInputs(ono, due);
	}
	
	public int setInputs(int ono, int due) {
		this.ono = ono;
		this.due = due;
	}
	
	public int getResult() {
		return this.ono / this.due;
	}

}
