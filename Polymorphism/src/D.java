class C
{
	void test1()
	{
		System.out.println("from test1.C");
	}
}

class D extends C
{
	void test1()
	{
		System.out.println("from test1.D");
	}
	/*
	int test1()
	{
		System.out.println("from test1.D");
		return 10;
	}*/
	public static void main(String[] args) 
	{
		C c1 = new D();
		c1.test1();
	}
}
