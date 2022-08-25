package inheritance;

public class room {//parent class
	int length,breath;
	public void setlb(int l,int b) {
		length=l;
		breath=b;
	}
	public int area() {
		return(length*breath);
		
	}
}
