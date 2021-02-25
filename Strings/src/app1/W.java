package app1;

public class W {

	public static void main(String[] args) {
		String s1 = "abcxyz"+ null;
		System.out.println(s1.length());
	}
}
/* now the content is abcxyznull and the length is 10*/