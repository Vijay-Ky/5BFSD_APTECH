class G
{
	static int p;

	G()
	{
		p += 10;
	}

	{
		p += 20;
	}

	void test1()
	{
		p1 += 30;
	}

	static void test2()
	{
		p += 40;
	}
	public static void main(String[] args) 
	{
		System.out.println("a: " + p);
		G g1 = new G();
		System.out.println("b: " + p);
		g1.test1();
		System.out.println("c: " + p);
		test2();
		System.out.println("d: " + p);
	}
}
/*
- static members can be used straigt away in the static and non-static 
-	
*/
