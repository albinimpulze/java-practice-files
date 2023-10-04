package LearnOOPS;

public class LearnInterface 
{
}

interface Carr
{
	void start();
	void drive();
	void stop();
	void engine();
	String color = "";
	String model = "";
	String brand = "";
	int cc = 0;
	
}

class Honda implements Carr
{
	public void engine()
	{
		System.out.println("V8 Engine");
	}
	public void start()
	{
		System.out.println("Car is starting");
	}
	public void drive()
	{
		System.out.println("Car is driving");
	}
	public void stop()
	{
		System.out.println("Car is stopping");
	}
	
	String color = "Black";
	String model = "NSX";
	String brand = "Honda";
	int cc = 3199;
}


class Maruti implements Carr
{
	public void engine()
	{
		System.out.println("DOHC Engine");
	}
	public void start()
	{
		System.out.println("Car is starting");
	}
	public void drive()
	{
		System.out.println("Car is driving");
	}
	public void stop()
	{
		System.out.println("Car is stopping");
	}
	
	String color = "Red";
	String model = "Swift";
	String brand = "Maruti";
	int cc = 1200;
	
}

class Test5
{
	public static void main(String[] args) 
	{
		Honda nsx = new Honda();
		nsx.start();
		nsx.drive();
		nsx.start();
		System.out.println(nsx.cc);
		System.out.println(nsx.color);
		
		
		Maruti swift = new Maruti();
		swift.start();
		swift.stop();
		System.out.println(swift.color);
		
	}
}