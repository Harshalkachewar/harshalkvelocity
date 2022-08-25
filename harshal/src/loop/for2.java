package loop;

public class for2 {
		public static void main(String[]args) {
			for(int i=1;i<=5;i++) {
				for(int j=(5-i);j>=0;j--) {
					System.out.print(" ");
					
				}for(int j=1;j<=i;j++) {
					System.out.print("*");
					for(int k=1;k<=(i-1)*1;k++) {
						System.out.print("*");
					}
				}System.out.println("");
				
			}
		}
}