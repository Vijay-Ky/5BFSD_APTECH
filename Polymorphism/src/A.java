class A 
{
	void test1()
	{
		System.out.println("from test1");
	}
	int test1(int i)
	{
		System.out.println("from test1(int)");
		return 0;
	}
	boolean test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
		return false;
	}
	boolean test1(double i, double j)
	{
		System.out.println("from test1(double,double)");
		return true;
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		System.out.println(a1.test1(90));
		System.out.println(a1.test1(90, 100));
		System.out.println(a1.test1(90.2, 100.6));
		System.out.println("done");
	}
}
