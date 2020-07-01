package worlds;

public class Paint {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private float litres;
		private float area;
		private float cost;
		
	
	
	public float getPrice(float litres, float area, float cost) {
		//divide litres and price by litres 
		//litres times squar divide price 
		
		float value = (litres * area) / cost;
		return value;
	}

}
