package methods;

public class Stat {
		public void m1() {
			m2();
			}
		public static void  m2() {
			System.out.println(" logic of m2");
		}
		public static void main(String[] args) {
			Stat obj = new Stat();
			obj.m1();
		}
		
}
