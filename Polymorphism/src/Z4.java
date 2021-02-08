class Z3
{
	int i = 10;
	static int test1(int i)
	{
		System.out.println("from test1(int).Z3");
		return 10;
	}
}

class Z4 extends Z3
{
	int i = 20;
	static void test1(int i, int j)
	{
		System.out.println("from test1(int, int).Z4");
	}
	public static void main(String[] args) 
	{
		//Z3 obj1 = new Z3();
		//obj1.test1(10);
		//Z4 obj2 = new Z4();
		//obj2.test1(10, 20);
		//Z3 obj3 = new Z4();
		//obj3.test1(10, 20);
		//Z3 obj4 = new Z3();
		//System.out.println(obj4.i);
		//Z4 obj5 = new Z4();
		//System.out.println(obj5.i);
		//Z3 obj6 = new Z4();
		//System.out.println(obj6.i);
		//Z4 obj7 = new Z4();
		//obj7.test1(10, 20);
	}
}
