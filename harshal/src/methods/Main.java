package methods;

public class Main {
	public void m1() {
		System.out.println(" logic m1");
	
	}
	public static void m2() {
		
		Main obj = new Main();
		obj.m1();
		System.out.println("harshalk");	
	}
	public static void main(String[] args) {
		m2();
	}
}
