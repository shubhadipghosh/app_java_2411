package superkeyword;

public class SuperExtendOne extends SuperOne {
	public void test2() {
		System.out.println(super.x);
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		SuperExtendOne ob = new SuperExtendOne();
		ob.test2();
		SuperOne obj = new SuperOne();
		obj.test();
		ob.test1();
		// System.out.println(super.i);//cannot use in static context
	}
}
