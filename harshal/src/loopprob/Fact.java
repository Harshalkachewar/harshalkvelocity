package loopprob;

public class Fact {
	public static void main(String[]args) {
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;//5*4*3*2*1
			
		}
		System.out.println("factorial of number is: " + fact);
	}
}
