package iibsib;

public class IibFive {
	static int i;
	int s;
	{
		i=20;
		s=9;
	}
	public static void main(String[] args) {
		IibFive ob=new IibFive();
		System.out.println("value of s "+ob.s);
		System.out.println("Static Variables are initalized in iib also "+IibFive.i);
	}
}
