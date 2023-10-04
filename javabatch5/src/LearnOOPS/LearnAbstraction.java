package LearnOOPS;

public class LearnAbstraction 
{}

//abstract 
abstract class AB
{
	//normal methods
	void display()
	{
		System.out.println("AB is displaying");
	}
	//abstract methods
	abstract void show();
}


abstract class XY extends AB
{
	
	abstract void output();
}

class JK extends XY
{

	@Override
	void output() {
System.out.println("JK is Outout");		
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
System.out.println("JK is showing");	}
	
}

class Test7
{
	public static void main(String[] args) 
	{
		JK x = new JK();
		x.show();
		x.display();
		x.output();
		
	}
}