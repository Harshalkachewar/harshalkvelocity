package inter2;
import inter1.parent1;
import inter1.parent2;
public class first implements parent1,parent2{

	@Override
	public void login() {
		System.out.println("login");
		
	}

	@Override
	public void homepage() {
		System.out.println("homepage");
		
	}

	@Override
	public void logout() {
		System.out.println("logout");
		
	}

	@Override
	public void sell() {
		System.out.println("sell");
		
	}

	@Override
	public void buy() {
		System.out.println("buy");
	}

}

