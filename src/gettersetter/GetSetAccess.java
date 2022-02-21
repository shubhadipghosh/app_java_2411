package gettersetter;

public class GetSetAccess extends GetSetDeclare {
	public static void main(String[] args) {
		GetSetAccess o1 = new GetSetAccess();
		o1.setRollNum(58);
		int val = o1.getRollNum();
		System.out.println(val);
	}
}
