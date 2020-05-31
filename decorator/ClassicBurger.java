package decorator;

public class ClassicBurger implements Burger {

	@Override
	public void order() {
		System.out.println("You ordered classic burger! ");
	}
	
}
