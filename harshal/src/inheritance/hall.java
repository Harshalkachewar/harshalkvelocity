package inheritance;

public class hall extends room{//child class
	int height;
	public void seth(int h) {
		height=h;
	}
	public int volume() {
		return(length*breath*height);
		
	}
	public static void main(String[]args) {
		hall obj=new hall();
		obj.setlb(23,65);
		obj.seth(9);
		System.out.println(" area of room: "+obj.area());
		System.out.println(" area of hall: "+obj.volume());
	}
	
}