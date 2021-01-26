class I
{
	I()
	{
		System.out.println("I()");
	}
}
class J extends I
{
	J()
	{
		System.out.println("J()");
	}
}
class K
{
	public static void main(String[]args)
	{
		I obj1 = new I();
		System.out.println("-------");
		J obj2 = new J();
		System.out.println("-------");
	}
}