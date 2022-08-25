package constructor;//args constructer

public class Para {
		int x;int y;
		
		public void Para(int a,int b) {
			x=a;
			y=b;
			
		}
		public void showxy() {
			System.out.println("value of x " +x);
			System.out.println("value of y " +y);
			
		}
		
		public static void main(String[]args) {
			Para obj =new Para();
			obj.Para(100,200 );
			obj.showxy();
		}
}



