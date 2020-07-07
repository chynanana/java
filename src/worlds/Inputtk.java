package worlds ;
import java.util.Scanner; 
public class Inputtk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		   Scanner words = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Hello, what is your name?");
		    String userName = words.nextLine();  // Read user input
		    System.out.println("Username is: " + userName);  // Output user input
		    
		   // int num1, num2;
		    Scanner nums = new Scanner(System.in);
		    System.out.println("Give me a number ");
		   //int nums = num1.nextInt();
		    //Scanner num = new Scanner(System.in);
		   // System.out.println("Another number ");
		   // int add = num.nextInt();
		   // int adding = (num) + (nums);
		    int ono = nums.nextInt();
		    System.out.println("Give me another number"); 
		    int due = nums.nextInt();
		    System.out.println("What do I do with it? ");
		    Scanner op = new Scanner(System.in);
		    //String poo = op.nextLine();
		    String inut = op.next();
		    if (inut.contains("+")) {
		    	int answer = ono + due; 
		    	System.out.println(answer);
		    }
		    else if (inut.contains("/")){
		    	int answer = ono / due;
		    	System.out.println(answer);
		    }
		    else if(inut.contains("*")){
		    	int answer = ono * due;
		    	System.out.println(answer);
		    }
		    else if(inut.contains("-")){
		    	int answer = ono - due;
		    	System.out.println(answer);
		    }
		    else {
		    	System .out.println(inut);
		    	System.out.println ("I don't know how to do that...");
		    }
		   
		  //  int answer = ono + due;
		    //System.out.println(answer)
		    ;
	}		

}
