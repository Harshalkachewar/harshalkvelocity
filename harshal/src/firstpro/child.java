package firstpro;

public class child extends parent  {
		public void a1() {
			System.out.println("i am in child class");
		}
		public static void main(String[]args) {
			child obj= new child();
			System.out.println(obj.a);
		}
}
