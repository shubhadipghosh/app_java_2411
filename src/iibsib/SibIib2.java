package iibsib;

public class SibIib2 {
	public SibIib2() {
		System.out.println("Constructor");
	}

	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		new SibIib2();
		System.out.println("Main");
	}

}
