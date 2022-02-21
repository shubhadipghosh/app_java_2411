package superkeyword;
//constructor calling
public class SuperExtendTwo extends SuperTwo {
	public SuperExtendTwo() {
		super();
		System.out.println("Child class Constructor");
	}

	public static void main(String[] args) {
		new SuperExtendTwo();
	}
}
