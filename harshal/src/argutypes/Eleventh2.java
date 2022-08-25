package argutypes;// without argument with return

public class Eleventh2 {
	public int prajkta() {
		int maths=56,phy=87,chem=87,tot;
		System.out.println("\n");
		System.out.println("score of prajkta:");
		System.out.println("maths:" +maths);
		System.out.println("phy:" +phy);
		System.out.println("chem:" +chem);
		tot=maths+phy+chem;
		return tot;
	}
		
		public int vishal() {
			int maths=89,phy=87,chem=78,tot;
			System.out.println("\n");
			System.out.println("score of vishal:");
			System.out.println("maths:" +maths);
			System.out.println("phy:" +phy);
			System.out.println("chem:" +chem);
			tot=maths+phy+chem;
			return tot;
		}
			
			public int nilima() {
				int maths=89,phy=90,chem=87,tot;
				System.out.println("\n");
				System.out.println("score of nilima:");
				System.out.println("maths:" +maths);
				System.out.println("phy:" +phy);
				System.out.println("chem:" +chem);
				tot=maths+phy+chem;
				return tot;
		
		}
			public static void main(String[]args) {
				Eleventh2 obj =new Eleventh2();
				System.out.println(obj.prajkta());
				System.out.println(obj.vishal());
				System.out.println(obj.nilima());
				
			}
			}
