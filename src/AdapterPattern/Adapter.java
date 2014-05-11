package AdapterPattern;

public class Adapter extends Adaptee implements Target{
	
	/*private Adaptee adaptee;
	
	public Adapter (Adaptee adaptee) {
		this.adaptee = adaptee;
	}*/

	@Override
	public void doSomething() {
		super.doAnything();
	}

}
