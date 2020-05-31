package facade;

public class BurgerEgg implements Order {

	@Override
	public void deliver() {
		System.out.println("Burger- extra egg delivered! ");
	}

}
