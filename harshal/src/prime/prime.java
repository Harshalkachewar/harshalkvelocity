package prime;

public class prime {
public static void main(String[]args) {
	int i,n;
	n=29;
	i=2;
	while(i<n)
	{
		if(n%i==0) {
			System.out.println("number is not prime");
			break;
		}
		i++;
	}
	if(i==n) {
		System.out.println("number is prime");
	}
}
}
