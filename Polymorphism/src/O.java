class N
{
	static void test1(int i)
	{
		System.out.println("from test1.N");
	}
}

class O extends N
{
	static void test1()
	{
		System.out.println("from test1.O");
	}
	public static void main(String[] args) 
	{
		N n1 = new O();
		O.test1();
		N.test1(20);
		n1.test1(30);
	}
}
