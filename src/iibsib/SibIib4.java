package iibsib;

public class SibIib4 {
	public SibIib4() {
		System.out.println("Constructor");
	}

	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		new SibIib4();
		
	}

}
