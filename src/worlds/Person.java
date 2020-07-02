package worlds;
import java.util.List;

public class Person {
	public String Name = "John";
	public int Age = 100;
	public String Job = "Unemployed";
	
	
	public Person(String name, int age, String job) {
		super();
		this.Name = name;
		this.Age = age;
		this.Job = job;
	}
	
	
	public Person() {
		super();
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String toString(){
		return "Name: "+ this.Name + ", age: " + this.Age + ", Job: " + this.Job;
	}
	
	

	//Person Clive = new Person("Clive", 42, "Electronic Engineer");
	//Clive.getPerson();
	//System.out.println (Clive);
}
