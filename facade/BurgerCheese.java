package facade;

public class BurgerCheese implements Order {

	@Override
	public void deliver() {
		System.out.println("Burgeg - Extra cheese delivered! ");
	}

}
