package LearnOOPS;

public class LearnPolymorphism 
{
//	constructor
//	Instance Variable
//	Methods
//	Inner Classes
}

class J
{
	int num = 5;
	void display()
	{
		System.out.println("J is displayed");
	}
}

class K extends J
{
	int num = 6;
	void display()
	{
		System.out.println("K is displayed");

	}

}
class L extends J
{
	int num = 6;

}
class Test3
{
	public static void main(String[] args) 
	{
		L l = new L();
		l.display();
		K k = new K();
		k.display();
	}
}