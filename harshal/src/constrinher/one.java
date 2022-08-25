package constrinher;

public class one  {
		public one() {
			System.out.println("i am in one class");
			
		}
		public class two extends one {
			public two() {
				System.out.println("i am in two class");
				
			}
			
	}
		public class three extends two{
			public three() {
				System.out.println("i am in three class");
			}
		}
		
			public static void main(String[]args) {
				System.out.println("order of constructer");
				new three();
			}
}
			
				
		

