package iibsib;

public class IibSibOne {
	IibSibOne(int i) {// fourth execution
		System.out.println("From Constructor");
	}

	static {// first executed
		System.out.println("From SIB");
	}
	{
		System.out.println("From IIB");// third execution
	}

	public static void main(String[] args) {
		System.out.println("From main");// second execution
		new IibSibOne(6);
	}
}
