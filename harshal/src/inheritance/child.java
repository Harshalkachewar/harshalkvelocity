package inheritance;

public class child extends parent{
	public void m3() {
		System.out.println("i am in child class");
	}
	public static void main(String[]args) {
		child obj= new child();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
