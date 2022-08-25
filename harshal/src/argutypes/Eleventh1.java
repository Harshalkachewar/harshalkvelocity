package argutypes;// without return type with argument

public class Eleventh1 {
	public void gen (int maths,int phy,int chem, String stname) {
		System.out.println("\n");
		System.out.println("name of student:- " + stname);
		System.out.println("maths:- " +maths);
		System.out.println("phy:- "+ phy);
		System.out.println("chem:- "+ chem);
		int total=maths+phy+chem;
		System.out.println("total:" +total);
			if(maths>35&&phy>35&&chem>35&&total>105)
				System.out.println(stname +" is pass");
			else
				System.out.println(stname +" is fail");
		}  
		
	public static void main(String[]args) {
		Eleventh1 obj =new Eleventh1();
		obj.gen(33,33 , 36, "sham");
		obj.gen(99,87 , 87, "prajkta");
		obj.gen(67,76 , 56, "nilima");
	}
}
 