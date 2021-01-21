class Object
{
	Object()
	{
		System.out.println("from object class");
	}
}
class A extends Object
{
	A()
	{
		System.out.println("from A()");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("done");
	}
}