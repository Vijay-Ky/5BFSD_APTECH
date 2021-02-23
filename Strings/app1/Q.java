package app1;

public class Q {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = null;
		String s3 = s1 + s2;
		String s4 = s2 + s1;
		boolean b1 = true;
		String s5 = b1 + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
/*
 * we can also add null. we dont get CE
 * + operator requires either left operand or right operand as string type.
 * 
 */
