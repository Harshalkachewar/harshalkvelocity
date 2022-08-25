package ppractice;

public class revstrchar {
		public static void main(String[]args) {
			String str="level";
			String rev="";
			char a[]=str.toCharArray();
			int len=a.length;
			
			
			for(int i=len-1;i>=0;i--) {
				
				rev=rev+a[i];
			}
			System.out.println("reverse string is : "+ rev);
		}
}
