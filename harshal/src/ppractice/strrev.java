package ppractice;

public class strrev {
		public static void main(String[]args) {
			
			String str="radar";
			String rev="";
				
			
			/*int len=str.length();
			for(int i=len-1;i>=0;i--) {
				
				rev=rev+str.charAt(i);
			}*/
			
			/*char a[]=str.toCharArray();
			int len=a.length;
			for(int i=len-1;i>=0;i--) {
				rev=rev+a[i];
			}*/
			
			StringBuffer sb= new StringBuffer(str);
			System.out.println(sb.reverse());
			
			
		//System.out.println("reverse string is : "+ rev);
			
}
}