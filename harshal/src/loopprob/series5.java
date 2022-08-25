package loopprob;//x-x*x+x*X*X-x*x*x*x;

public class series5 {
	 public static void main(String[]args) {
   	  int n=4;
   	  int x=2;
   	  
   	  int term=x;
   	  int sum=0;
   	  for(int i=1;i<=4;i++) {
   		  sum=sum+term;
   		  term=term*(-x);
   	  }System.out.println(sum);
     }
}
