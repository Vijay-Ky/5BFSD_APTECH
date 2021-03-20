package app1;

public class M2
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("loop1: " + i);
		}
		//after completing first for loop
		for(int i = 2000; i <= 3000; i++)
		{
			System.out.println("loop2: " + i);
		}
		//after completing second for loop
		for(int i = 4000; i <= 5000; i++)
		{
			System.out.println("loop3: " + i);
		}
	}
}
//only one thread executing this program so sequential output.