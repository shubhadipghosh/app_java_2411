package iibsib;

public class IibFour {
	{
		System.out.println("Hello");
	}
	IibFour(){
		System.out.println("From Constructor");
	}
	IibFour(int x){
		System.out.println("From Constructor with return"+" "+x);
	}
	public static void main(String[] args) {
		new IibFour(6);
		new IibFour();
		
	}
}
