interface MyInterface
{
	int i = 100;
	default void test1()
	{
		System.out.println("from test1() of MyInterface");
	}
	static void test2()
	{
		System.out.println("from test2() of MyInterface");
	}
	default void test3()
	{
		System.out.println("from test3() of MyInterface");
	}
	static void test4()
	{
		System.out.println("from test4() of MyInterface");
	}
}
class MyClass implements MyInterface 
{
	public static void test2()
	{
		System.out.println("from test2() of MyClass");
	}
	public static void main(String[] args) 
	{
		MyInterface obj = new MyClass();
		MyInterface.test2();
		MyInterface.test2();
		MyInterface obj2 = new MyClass();
		obj2.test3();
		MyInterface.test4();
	}
}
