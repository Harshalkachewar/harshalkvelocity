package loopprob;//x-x3+x5-x7

public class series7 {
	 public static void main(String[]args) {
   	  int n=4;
   	  int x=2;
   	  
   	  int term=x;
   	  int sum=0;
   	  for(int i=1;i<=4;i++) {
   		  sum=sum+term;
   		  term=term*(-x*x);
   	  }System.out.println(sum);
     }
}
