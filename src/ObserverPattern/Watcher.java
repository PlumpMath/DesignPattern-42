package ObserverPattern;

public class Watcher implements Obsever{

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.err.println("i am watcher:"+context);
	}


}
