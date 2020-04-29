import java.util.Observer;

public interface Observable {
	
	public void like(Observer observer);
	public void dislike(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
