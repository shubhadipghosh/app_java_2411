package iibsib;

public class SibIib7 {
	public SibIib7() {
		System.out.println("Constructor");
	}

	static {
		System.out.println("SIB");
		new SibIib7();
	}
	{
		System.out.println("IIB");
	}

	public static void main(String[] args) {
		new SibIib7();
		System.out.println("Main");
		
		
	}

}
