package ObserverPattern;

import java.util.Observer;

public interface Observable {
	public void addObserver(Obsever observer);

	public void deleteObserver(Observer observer);

	public void notifyObservers(String context);
}
