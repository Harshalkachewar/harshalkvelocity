 package POLYMORPHISAM;

public class PARENT {
	public void m1() {
		System.out.println("i am in p1 class");
	}
	public void m1(int c,char a) {
		System.out.println("i am in p2 class");
	}
	public void m1(char a,int c) {
		System.out.println("i am in p3 class");
	}
	public static void main(String[]args) {
	PARENT obj=new PARENT();
		obj.m1();
		obj.m1('@',44);
		obj.m1(55,'%');
	}
}
