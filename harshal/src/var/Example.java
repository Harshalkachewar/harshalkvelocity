package var;

public class Example {


		// the variables a and b are parameters
		public static int multiply(int a,int b)
		{
			return a * b;
		}

		public static void main(String[] args)
		{
			int x = 2;
			int y = 5;

			int product = multiply(x, y);

			System.out.println("answer" + product);
		}
	}


