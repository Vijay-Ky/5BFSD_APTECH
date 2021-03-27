public class Thread implements Runnable 
{
	private Runnable runnable;
	public Thread(Runnable runnable)
	{
		this.runnable = runnable;
	}
	public void run()
	{
		if(runnable != null)
		{
			runnable.run();
		}
	}
	...........
    ...........
	...........
}

Object
-----------
wait()
notify()
notifyAll()