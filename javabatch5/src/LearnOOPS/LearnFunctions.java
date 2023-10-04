package LearnOOPS;

public class LearnFunctions 
{}

class Practice
{
	String isArmstrong(int num)
	{
//		number of digits
		int t1 = num; //0
		int digit = 0;  //3
		while(t1>0)
		{
			digit++;
			t1 = t1/10;
		}
//		sum & multiplication
		int t2 = num;  //1
		int sum = 0; //153
		while(t2>0)
		{
			int rem = t2%10; //1
			int multi = 1; //1
			for(int i=1;i<=digit;i++)
			{
				multi = rem*multi;
			}
			sum+=multi;
			t2/=10;
		}
//		comparison
		if(num==sum)
		{
			return "Is an armstrong number";
		}
		else
		{
			return "Is not an armstrong number";
		}
	}
}

class Run
{
	public static void main(String[] args) 
	{
		Practice p = new Practice();
		System.out.println(p.isArmstrong(372));
		
	}
}








