package iibsib;

public class SibIib3 {
	public SibIib3() {
		System.out.println("Constructor");
	}

	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		new SibIib3();
		
	}

}
