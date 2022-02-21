package superkeyword;

public class SuperExtendThree extends SuperThree {
	SuperExtendThree(int x) {
		System.out.println("child class constructor with args");
	}
	SuperExtendThree() {
		System.out.println("child class constructor without args");
	}

	public static void main(String[] args) {
		new SuperExtendThree(6);
		new SuperExtendThree();
	}
}
