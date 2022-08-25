package ppractice;

import java.util.Scanner;

public class palin {
		public static void main(String[]args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the number: ");
			int n=sc.nextInt();
			
			int rev=0;
			int r=0;
			int num=n;
			while(n!=0) 
			{
				r=n%10;
				rev=rev*10+r;
				n=n/10;
				
			}
			if(num==rev)
			
			System.out.println("number is palin");
			else
				System.out.println("niot");
			
			
		}
}

