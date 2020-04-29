
public class ObserverMain {

	public static void main(String[] args) {

		Theme theme = new Theme();
		Observer obs1 = new ThemeLiker("Person 1");
		Observer obs2 = new ThemeLiker("Person 2");
		Observer obs3 = new ThemeLiker("Person 3");
		
		theme.like(obs1);
		theme.like(obs2);
		theme.like(obs3);
		
		theme.setName("New theme");
		theme.setName("Another theme");
	}

	}

