package facade;

public class FacadeMain {

	public static void main(String[] args) {
		
		OrderFacade deliverFacade = new OrderFacade();
		deliverFacade.orderBurger();
		deliverFacade.orderBurgerCheese();
		deliverFacade.orderBuergerEgg();
		
	}

}
