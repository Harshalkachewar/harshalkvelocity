package methods;

public class NonStaticMeth {
	public static void m1(){
		System.out.println("m1=static method");
	
}
	public void m2() {
		System.out.println("m2=non stativ meth");
	}
	
public static void main(String[] args) {
	m1();
	NonStaticMeth obj= new  NonStaticMeth();
	obj.m2();
}
}