package var;

public class Local {
	static int a=500;
	int b=250;
	public void m1() {
		int c=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void m2() {
		System.out.println(a);
		Local obj =new Local();
		System.out.println(obj.b);
		//System.out.println(c);
	}
	public static void main(String[] args) {
		Local obj =new Local();
		obj.m1();
		m2();
		
	}
}
