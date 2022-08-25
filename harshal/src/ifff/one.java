package ifff;



public class one {

	public static void main(String[]args){
		int num =1234;
		int even=0;
		int odd =0;

		while(num>0){

		int r= num%10;
		if(r%2==0)
		even++;
		else 
		odd++;
		num=num/10;
		}
		System.out.println("number of even numbers:"+even);
		System.out.println("numbers of odd numbers:"+odd);
		}


	}

