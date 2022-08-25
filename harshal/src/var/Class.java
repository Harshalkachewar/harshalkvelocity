package var;

public class Class {
		static int h= 234;
		

public void m1() {
	int a=123;
	System.out.println(a);
	System.out.println(Class.h);//classname.var is only for static vr
	
}
	public static void main(String[] args) {
		Class obj =new  Class();
		obj.m1();
	}
}