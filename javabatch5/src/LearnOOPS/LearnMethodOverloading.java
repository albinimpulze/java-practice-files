package LearnOOPS;

public class LearnMethodOverloading 
{}


//Overloading : 
//1) number of parameters
//2) type of parameters



class Z
{
	void show()
	{
		System.out.println("Show is called");
	}
	
	void show(int x)
	{
		System.out.println(x + " is called");
	}
	void show(String x)
	{
		System.out.println(x + " is called");
	}
	
	void show(int x , String y)
	{
		System.out.println(x + " is called with " + y);
	}
	void show(int x , int y)
	{
		System.out.println( x + " and " + y + " is called");
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.show();
		z.show(5);
		z.show("Shivam");
		z.show(3, 4);
		z.show(8, "Pawan");
	}
}


