package ObserverPattern;
import java.util.Observer;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watched watched=new Watched();//���۲���
		Watcher watcher=new Watcher();
		
		watched.addObserver(watcher);
		
		watched.notifyObservers("nishizhu");
	}

}
