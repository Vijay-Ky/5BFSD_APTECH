import java.util.ArrayList;
class MM5 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();


		for(String s1 : args)
		{
			if(!list.contains(s1))
			{
				list.add(s1);
			}
		}
		System.out.println(list);
	}
}
