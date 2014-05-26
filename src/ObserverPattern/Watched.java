package ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Watched implements Observable{

	private List<Obsever> observers=new ArrayList<Obsever>();
	@Override
	public void addObserver(Obsever observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		// TODO Auto-generated method stub
		for(Obsever observer:observers){
			observer.update(context);
		}
	}

	

}
