package iibsib;
//always executes child class IIB first
public class ExperimentIibTwo extends IibTwo {
	int g;
	long k;
	{
		g=90;
		k=89342789457l;
	}
	{
		System.out.println("Child class");
	}
	

	public static void main(String[] args) {

		ExperimentIibTwo ob = new ExperimentIibTwo();
		System.out.println(ob.g);
		System.out.println(ob.k);
		System.out.println(ob.x);
		System.out.println(ob.y);
		
	}

}
