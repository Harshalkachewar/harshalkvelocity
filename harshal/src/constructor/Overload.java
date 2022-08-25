package constructor;

public class Overload {
	
		
		public  Overload() {//default
			this(100,200);
			
		
			
		}
		public void Overload(int h,int w) {
		
		}
		
		public void showdata() {
			System.out.println("height="+h);
			System.out.println("width="+w);
			
			
		}
		public static void main(String[]args) {
			new Overload();
		  
		 
			
			
		} 
}
