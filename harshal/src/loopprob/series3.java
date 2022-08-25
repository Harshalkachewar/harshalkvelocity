package loopprob;//1+4+7+10

public class series3 {
	public static void main(String[]args) {
		int  n=4;
		int sum=0;
		int term=1;
		for(int i=1;i<=n;i++) {
			sum=sum+term;
			term=term+3;
			
		}System.out.println(sum);
	}
}
