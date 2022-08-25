package superr;

public class super1 extends Superr{//child class
     	static int a=23;
     	int b=11;
     	public void m1() {
     		System.out.println(b);//direct call
     		System.out.println(super.b);//called through super keyword for non stat
     		                            //variable
     		
     	}
     	public  static void m2() {
     		System.out.println(a);//direct call
     		System.out.println(Superr.a);//called through clssname.var for static 
     		                             //variable
     	}
     	
     	public static void main(String[]args) {
     		super1 obj=new super1();
     		obj.m1();
     		m2();
     		
     	}
     	
}
