package heirachical;

public class c extends a{//child2
	int y,z;
	public  c() {
		y=20;
	}
	public void div() {
		z=x/y;
		
	}
	public void disp() {
		System.out.println("i am in c");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[]args) {
		b obj=new b();//
		obj.mul();
		obj.disp();
		
		c obj1=new c();
		obj1.div();
		obj1.disp();
		}

}
