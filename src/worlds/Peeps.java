package worlds;

import java.util.ArrayList;

public class Peeps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Person> sims = new ArrayList<>();

		Person steve = new Person("Steve", 42 , "Engineer");
		//System.out.println(steve);
		sims.add(steve);
		//System.out.println(sims);
		
		Person ali = new Person("Ali ",21);
		//System.out.println(ali);
		sims.add(ali);
		//System.out.println(sims);
		
		sims.forEach(x -> System.out.println(x));
		sims.forEach(x -> System.out.println(x.getJob()));
		sims.forEach(x -> System.out.println(x.getAge()));
		sims.forEach(x -> System.out.println(x.getName()));
		
	}

}
