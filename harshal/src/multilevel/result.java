package multilevel;

public class result extends test {//child2
		int total;
		public void ct() {
			total=s1+s2;
		
		}
		public void showt() {
			System.out.println("total marks="+total);
		}
		public static void main(String[]args) {
			result obj=new result();
			obj.setr(111);//parent
			obj.setm(67,87);//child1
			obj.ct();//child2
			
			
			obj.showroll();//parent class
			obj.showm();//child1 class
			obj.showt();//child2 class
		}
}
