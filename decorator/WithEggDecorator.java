package decorator;

public class WithEggDecorator extends BurgerDecorator {

	public WithEggDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public void order() {
		decoratedBurger.order();
		setEggExtra(decoratedBurger);
	}

	private void setEggExtra(Burger decoratedBurger) {
		System.out.println("Adding extra egg! ");
	}
	
}
