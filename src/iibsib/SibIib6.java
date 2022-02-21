package iibsib;

public class SibIib6 {
	public SibIib6() {
		System.out.println("Constructor");
	}

	static {
		System.out.println("SIB");
		new SibIib6();
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		
	}

}
