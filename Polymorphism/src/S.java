class R
{
	static void test1()
	{
		System.out.println("from test1.R");
	}
}

class S extends R
{
	static void test1(int i)
	{
		System.out.println("from test1.S");
	}
	public static void main(String[] args) 
	{
		R.test1();
		S.test1(1);
	}
}
