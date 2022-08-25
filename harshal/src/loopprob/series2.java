package loopprob;//2+4+6+8+10

public class series2 {
	public static void main(String[]args) {
		int  n=4;
		int sum=0;
		int term=2;
		for(int i=1;i<=n;i++) {
			sum=sum+term;
			term=term+2;
			
		}System.out.println(sum);
	}
}
