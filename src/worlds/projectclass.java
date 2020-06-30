package worlds;

public class projectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println ("hello world");
		for (int i=0; i <=100; i++) {
			//System.out.println(i);
			if ((i%5==0)&&(i%3==0)) {
				System.out.println("fizzbuzz");
			}
			else if (i%5==0) {
				System.out.println("buzz");
			}
			else if (i%3==0) {
				System.out.println("fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
