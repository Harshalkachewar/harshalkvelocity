package constructor;// default constructer 1

public class Test {
	int x;int y;
     public void Test() {
    	 x=10;y=20;
    	 
     }
      public void disp() {
    	  
    	  System.out.println("value of x is" +x);
    	  System.out.println("value of y is" +y);
    	  
    	 
      }
      public static void main(String[]args) 
    	  Test obj= new Test();
    	  obj.Test();
    	  obj.disp();
    	  
      }
}