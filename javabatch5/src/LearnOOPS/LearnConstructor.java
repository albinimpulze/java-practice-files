//October 03 - Tuesday
package LearnOOPS;

public class LearnConstructor 
{
//	Constructor
//	default
//	parameterized
//	constructor overloading

}


class Kuchbhi
{
	Kuchbhi(int a)
	{
		System.out.println("Parameterized constructor of Kuchbhi");
		
	}
	Kuchbhi()
	{
		System.out.println("Default Constructor");
	}
	Kuchbhi(int a, int b) //local variable
	{
		this.num1 = a;
		this.num2 = b;
	}
	Kuchbhi(int a, int b, String c)
	{
		this.num1 = a;
		this.num2 = b;
		this.name = c;
		
	}
	
	int num1 = 0; //global variable
	int num2 = 0;
	String name = " ";
	
	
	
	int x = 6;  //attribute
	int y= 4;
	//user defined method
	void run()
	{
		System.out.println(num1+num2);
	}

	void addNum()
	{
		System.out.println(x+y);
	}
}


class Test6
{
	public static void main(String[] args) 
	{
		Kuchbhi obj1 = new Kuchbhi();
		Kuchbhi obj2 = new Kuchbhi(3);
		Kuchbhi obj3 = new Kuchbhi(3,4);
		Kuchbhi obj4 = new Kuchbhi(3,4,"Shivam");
		obj3.run();
	}
}







