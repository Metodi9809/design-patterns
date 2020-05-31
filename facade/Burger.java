package facade;

public class Burger implements Order {

	@Override
	public void deliver() {
		System.out.println("Classic Burger delivered! ");
	}
	
}
