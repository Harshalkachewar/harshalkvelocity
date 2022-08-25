package constructor;

public class Num {
		public Num() {
			this(12);
			System.out.println("constructer 3");
			}
		public Num(int a) {
			this(56,87);
			System.out.println("constructer 2");
		    }
		public Num(int a,int b) {
			System.out.println("constructer 1");
		    }
		public static void main(String[]args) {
			new Num();
			
			
		}
		
}
