package methods;

public class Static {
	public void m1() {
		System.out.println("logic m1");
		
	}
	public void m2() {
		m1();
		System.out.println("logic m2");
		
	}
	public static void main(String[] args) {
		Static obj= new Static();
		obj.m2();
	}
}
