package howToCreateClass;

public class Bulldog {
	
	String name;
	String color;
	int age;
	double weight;
	
	void walking() {
		System.out.println("Bulldog is runing fast");
	}
	void bite() {
		System.out.println("Bulldog do bite");
	}
	void eat() {
		System.out.println("Bulldog eat meat");
	}
	public static void main(String[] args) {
		Bulldog dog=new Bulldog();
		dog.name="bulldog";
		dog.color="black";
		dog.age=12;
		dog.weight=20;
		dog.walking();
		
		System.out.println(dog.age);
	}
	
}	
