package worlds;
import java.util.HashMap;
public class Hashm {
	public static void main(String[] args) {
		
		HashMap<String, String> Cities = new HashMap<String, String>();
		
		Cities.put("London", "England");
		Cities.put("Leeds", "England");
		System.out.println(Cities);
		
		HashMap<String, Integer> Peep = new HashMap<String, Integer>();
		
		Peep.put("Thomas", 1);
		System.out.println(Peep.values());
		//handy as addressable 
		//keyset() shows key Values() shows values 
	for (String i : Cities.keySet())
		System.out.println(i);
	//for(String x : Peep.values())
		//System.out.println(x); cannot resolve int to string 
	}

}
