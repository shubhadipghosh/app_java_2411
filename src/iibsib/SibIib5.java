package iibsib;

public class SibIib5 {
	public SibIib5() {
		System.out.println("Constructor");
	}

	static {
		new SibIib5();
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		
	}

}
