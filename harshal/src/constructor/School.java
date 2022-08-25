package constructor;

public class School {
		int maths;
		int chem;
		int phy;
		String stname;
	
		public School (int maths,int phy,int chem,String stname) {
			this.maths=maths;
			this.phy=phy;
			this.chem=chem;
			this.stname=stname;
			System.out.println("Name of students:" +stname);
			System.out.println("maths:" +maths);
			System.out.println("physics:" +phy);
			System.out.println("chemistry:" +chem);
			Totalmarks();
		}
		public void Totalmarks() {
			int Totalmarks=maths+phy+chem;
			System.out.println("total marks:" +Totalmarks+"\n");
		}
		public static void main(String[]args) {
			new School(67,87,89,"ram");
			new School(98,78,56,"shakal");
			new School(56,76,78,"kancha");


			
			
			
		}
}


