
public class ThemeLiker implements Observer {
	
	private String name;
	private Observable theme;
	

	public ThemeLiker(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		if(theme == null) {
			System.out.println("No topic");
			return;
		}
		
		String topicName = theme.getUpdate();
		System.out.println(this.getName() + " updated with: " + "Topic is: " + topicName);
		
	}
	@Override
	public void setTheme(Observable topic) {
		this.theme = topic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
