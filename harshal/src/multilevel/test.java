package multilevel;

import heirachical.c;//child1

public class test extends student{
		int s1,s2;
		public void setm(int m1,int m2) {
			s1=m1;
			s2=m2;
		}
		public void showm() {
			System.out.println("marks of students");
			System.out.println("s1="+s1);
			System.out.println("s2="+s2);
		}
}
