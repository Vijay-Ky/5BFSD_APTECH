package app2;
class Shared
{
	//void test1()
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	}
	void test2()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	}
}
class Thread1 extends Thread
{
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		//s1 is a shared type
		s1.test1();
	}
}
class Thread2 extends Thread
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() {
		//s1 is a shared type
		s1.test1();
	}
}
public class M1 {

	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s2);
		
		//three threads accessing one object
		//only one copy of test1 method
		t1.start();
		t2.start();
		
		s1.test1();
	}
}
/* 
 * always advisable to share one object to more threads
 * if we share one object to more threads then the object
   usage will be increasing
 * but if more threads access one object at a time simultaneously
   data corruption will occur.
 * if multiple thread access the same object simultaneously
   object scope will increase but data corruption happens
   that is why we should not allow simultaneously accessing
   one object by multiple threads.
   that is why we use synchronization to avoid access on the same resource 
   by multiple threads.
   we can achieve synchronization by synchronize keyword.
* synchronized keyword avoiding multiple threads accessing one object simultaniousely.
*/