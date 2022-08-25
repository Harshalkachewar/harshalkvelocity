package var;

public class Varrr {
	int h=101;
	
	public void chech() {
	System.out.println(h);
	
		
	}
	public static void main(String[] args) {
		Varrr obj = new Varrr();
		obj.chech();
		obj.h=201;
		System.out.println(obj.h);
		Varrr obj1 = new Varrr();
		obj1.h=2053;
		System.out.println(obj1.h);
	}
}
