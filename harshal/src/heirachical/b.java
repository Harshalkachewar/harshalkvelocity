package heirachical;

public class b extends a{//child1
	int y,z;
	public  b() {
		y=20;
	}
	public void mul() {
		z=x*y;
	}
	public void disp() {
		System.out.println("i am in b");	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}