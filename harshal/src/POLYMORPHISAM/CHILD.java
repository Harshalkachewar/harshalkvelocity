package POLYMORPHISAM;

public class CHILD extends PARENT{
		public void m1(boolean c) {
		System.out.println("i am in child class");
			
		
		}
		public static void main(String[]args) {
			CHILD obj= new CHILD();
			obj.m1();//parent
			obj.m1(true);//child
			
		}
}
