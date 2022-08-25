package argutypes;//with return with argument

public class Eleventh {
		public int gen(int maths,int phy,int chem,String stname) {
			System.out.println("\n");
			System.out.println("name of student:-"+ stname);
			System.out.println("maths:-" +maths);
			System.out.println("phy:-"+ phy);
			System.out.println("chem:-"+ chem);
			int total=maths+phy+chem;
			System.out.println("total:");
			if(maths>40&&phy>40&&chem>40)
				System.out.println(stname +" is pass");
			else 
				System.out.println(stname +" is fail");
				
			
			
			return total;
			
		
			}    
		public static void main(String[]args) {
			Eleventh obj =new Eleventh();
			System.out.println(obj.gen(30,34 , 33, "harshal"));
			System.out.println(obj.gen(99,87 , 87, "vishal"));
			System.out.println(obj.gen(70,87 , 78, "nilima"));
		}
			
		}
		
		