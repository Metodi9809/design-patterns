package decorator;

public class OrderedBurger implements Burger {
	@Override
	public void order() {
		System.out.println("Ordering classic burger! ");
	}
}
