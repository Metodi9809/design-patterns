package decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		Burger burger = new OrderedBurger();
		
		burger.order();
		
		Burger anotherBurger = new OrderedBurger();
		Burger anotherBurgerCheese =
				new WithCheeseDecorator(anotherBurger);
		anotherBurgerCheese.order();
		
		Burger thirdBurger = new OrderedBurger();
		Burger thirdBurgerEgg =
				new WithEggDecorator(thirdBurger);
		thirdBurgerEgg.order();
	}

}
