package ppractice;
import java.util.Scanner;

public class scinput {
		public static void main(String[]args) {
			
			
			Scanner in =new Scanner(System.in);
			System.out.println("Enter username:");
			String username=in.nextLine();
			System.out.println("Enter surname:");
			String surname=in.nextLine();
			
			System.out.println("username is : " + username + surname);
		}
}
 