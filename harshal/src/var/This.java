package var;

public class This {
	int a=200;
	

  public void m1() {
	int a= 40;
	System.out.println(a);
	System.out.println(this.a);
	
  }
  public static void main(String[] args) {
	  This obj =new This();
	  obj.m1();
  }
  }
