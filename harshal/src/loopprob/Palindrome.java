package loopprob;// checking palindrome number:


public class Palindrome {
		public static void main(String[]args) {
			int n=101;
			int r;
		    int	rev=0;
			int num=n;
			  
			while(n!=0) {
				r=n%10;//1
				rev=rev*10+r;//
				n=n/10;//
			}
			if(num==rev) 
				System.out.println("number is palindrome number");
			else 
				System.out.println("number is not palindrome");
			
		}
		
}
