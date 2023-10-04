package LearnOOPS;

public class Ques3 {
}

class Vehicle
{
	Vehicle(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	String make;
	String model;
	int year;
	
	void generalInfo()
	{
		System.out.println("Make : " + make);
		System.out.println("Model : " + model);
		System.out.println("Year : " + year);
	}
	
	
}

class Motorcycle extends Vehicle
{

	Motorcycle(String make, String model, int year) {
		super(make, model, year);
	}
	
	boolean isTwoSeater = true;
	
	void displayVehicleInfo()
	{
		super.generalInfo();
		System.out.println("Is Two Seater : " + isTwoSeater);
	}
	
	
}

class Car extends Vehicle
{

	Car(String make, String model, int year) {
		super(make, model, year);
	}
	
	int numofDoor = 4;
	
	void displayVehicleInfo()
	{
		super.generalInfo();
		System.out.println("Number of Doors : " + numofDoor);
	}
}

class Test1
{
	public static void main(String[] args) {
		
		Motorcycle suzuki = new Motorcycle("Japanese", "Samurai", 1995);
		Car honda = new Car("Indian", "City", 2004);
		
		suzuki.displayVehicleInfo();
		System.out.println();
		honda.displayVehicleInfo();
		
	}
}