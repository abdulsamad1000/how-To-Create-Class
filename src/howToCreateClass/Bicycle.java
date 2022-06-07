package howToCreateClass;

public class Bicycle {
	
	String name;
	int tier;
	String chain;
	int steeringwheel;
	int bell;
	String lamp;
	int padal;
	
	void speeding() {
		System.out.println("Bicycle can speed ");
	}
	void carry() {
		System.out.println("Bicycle can carry people");
	}
	void hasbreak() {
		System.out.println("Bicycle has break");
	}
	public static void main(String[] args) {
		Bicycle Umberx1=new Bicycle();
		Umberx1.name="two handel";
		Umberx1.tier=2;
		Umberx1.steeringwheel=1;
		Umberx1.bell=1;
		Umberx1.lamp="front lamp";
		Umberx1.padal=2;
		
		Umberx1.speeding();
		System.out.println(Umberx1.steeringwheel);
		
	}
	
}
