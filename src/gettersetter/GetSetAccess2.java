package gettersetter;

public class GetSetAccess2 extends GetSetDeclare2 {
	public static void main(String[] args) {
		GetSetDeclare2 ob = new GetSetDeclare2();
		ob.setWeight(22.1f);
		float weight = ob.getWeight();
		ob.setRoolNos(67);
		int rollNos = ob.getRollNos();
		System.out.println("Roll no " + rollNos + " has weight " + weight + " Kgs");
	}
}
