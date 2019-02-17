
class Car{
	private String carName;
	private boolean engine;
	private int noOfCylinders;
	private int noOfWheels;
	
	public Car(String carName,boolean engine,int noOfCylinders,int noOfWheels) {
		this.carName = carName;
		this.engine = engine;
		this.noOfCylinders = noOfCylinders;
		this.noOfWheels = noOfWheels;
	}

	public String getCarName() {
		return carName;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public String startEngine() {
		return "car engine started";
	}
	public String acclerate() {
		return "engine acclerated";
	}
	public String brake() {
		return "brake has been applied";
	}
	
}

class Audi extends Car{
	public Audi(){
		super("Audi",true,5,4);
	}
	public String startEngine() {
		return "Audi Engine Started";
	}
	public String acclerate() {
		return "Audi engine acclerated";
	}
	public String brake() {
		return "Audi brake has been applied";
	}
class BMW extends Car{
	public BMW(){
		super("BMW",true,5,4);
	}
	public String startEngine() {
		return "BMW Engine Started";
	}
	public String acclerate() {
		return "BMW engine acclerated";
	}
	public String brake() {
		return "BMW brake has been applied";
	}
}
class Maruti800 extends Car{
	public Maruti800(){
		super("Maruti800",true,5,4);
	}
	public String startEngine() {
		return "Maruti800 Engine Started";
	}
	public String acclerate() {
		return "Maruti800 engine acclerated";
	}
	public String brake() {
		return "Maruti800 brake has been applied";
	}
}
	
}



public class Main {

	public static void main(String[] args) {
	Audi audi = new Audi();
	System.out.println("accelerate : "+audi.acclerate());
	audi.brake();


	}

}
