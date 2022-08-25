package constructor;//constructer with default arguments


public class Defcons {
		int x,y;
		
		public void Defcons(int a) {
			x=a;
		
		}
		public void showxy() {
			System.out.println("value of x " +x);
		
}
		public static void main(String[]args) {
			Defcons obj=new Defcons();
			obj.Defcons(100);
			obj.showxy();
		}
}
