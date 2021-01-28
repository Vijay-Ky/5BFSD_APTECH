class C
{
	public static void main(String[] args) 
	{
		System.out.println("Total No. of arguments: " + args.length);
		for(String arg: args)
		{
			System.out.println("argument: " + arg);
		}
	}
}