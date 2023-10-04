package LearnOOPS;

public class LearnInheritance 
{}

//Constructor
//default , non-parameter
//parameterized

class A 
{
	A()
	{}
	
	A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	A(int z)
	{
		this.z = z;
	}

	
	int x; //attribute
	int y;
	int z;
	
	
	void show() 
	{
		
		System.out.println(x+ " x");
		System.out.println(y +" y");
		System.out.println(z + " z");
	}
}

class B
{
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A(5);
		A a2 = new A(4, 2);
		
		
		
		a.show();
		
	
	
	}
}





