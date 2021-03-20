package app1;

class K extends Thread
{
	@Override
	public void run() {
		System.out.println("child thread");
		Thread  t1 = Thread.currentThread();
		System.out.println("child thread priority: " + t1.getPriority());
	}
}
public class M15 {

	public static void main(String[] args) {
		K k1 = new K();
		k1.start();
		System.out.println(k1.getName());
		k1.setName("first child");
		System.out.println(k1.getName());
		Thread  t1 = Thread.currentThread();
		System.out.println("main thread priority: " + t1.getPriority());
	}
}
