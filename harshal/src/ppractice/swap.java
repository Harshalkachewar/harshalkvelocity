package ppractice;

public class swap {
		public static void main(String[]args) {
		int a=10;
			int b=20;
			/*System.out.println("before swapping"+a+" "+b);
			int t=a;
			a=b;
			b=t;
			
			System.out.println("after swapping :"+a+" "+b);
		}*/
			
			
			/*a=a+b;//30
			b=a-b;//30-20=10
			a=a-b;30-10=20
			System.out.println("after swapping: "+a+" "+b);*/
			
			//without using third varible
			//here a and b should not be zero
			
		/*	a=a*b;200
			b=a/b;200/20=10
			a=a/b;200/10=20
			System.out.println("after swapping:"+a+" "+b);*/
			
			
			//single statement
			b=a+b-(a=b);
			System.out.println("After swapping:"+a+" "+b);
			
			
			
			
			
			
			
			
		}
			
			
			
			
			
			
}
