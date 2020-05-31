package facade;

public class OrderFacade {
	
	private Order burger;
	private Order burgerCheese;
	private Order burgerEgg;
	
	public OrderFacade() {
		this.burger = new Burger();
		this.burgerCheese = new BurgerCheese();
		this.burgerEgg = new BurgerEgg();
	}
	
	public void orderBurger(){
		this.burger.deliver();
	}
	
	public void orderBurgerCheese() {
		this.burgerCheese.deliver();
	}
	
	public void orderBuergerEgg() {
		this.burgerEgg.deliver();
	}
}
