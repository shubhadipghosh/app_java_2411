package iibsib;

public class IibOneConstruct {
	int x;
	float y;
	// instance initialization block
	//executes second
	{
		x = 10;
		y = 9.78f;
	}
	//first execution occurs, because of object creation
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		IibOneConstruct ob = new IibOneConstruct();
		System.out.println(ob.x);
		System.out.println(ob.y);
	}
}
