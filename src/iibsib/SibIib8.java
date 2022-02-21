package iibsib;

public class SibIib8 {
	static int j;
	public SibIib8() {
		System.out.println("Constructor");
	}

	static {
		j=9;
		System.out.println("SIB");
		new SibIib8();
		System.out.println("value of j: "+j);
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		new SibIib8();
		
	}

}
