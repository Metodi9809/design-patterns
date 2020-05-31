package decorator;

public class WithCheeseDecorator extends BurgerDecorator {

	public WithCheeseDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public void order() {
		decoratedBurger.order();
		setCheeseExtra(decoratedBurger);
	}

	private void setCheeseExtra(Burger decoratedBurger) {
			System.out.println("Adding cheese to the burger! ");
	}
}
