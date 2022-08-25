package loopprob;// armstrong number

public class Armstrong {
		public static void main(String[]args) {
			int n=153;//1+5+3=153
			int r;
			int sum=0;
			int num=n;
			while(n!=0) {
				r=n%10;
				sum=sum+r*r*r;
				n=n/10;
			}
			if(num==sum)
				System.out.println("number is armstrong");
			else
				System.out.println("number is not armstrong");
			
			
			
			
		}
}
