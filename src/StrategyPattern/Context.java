package StrategyPattern;

public class Context {
	
	private IStrategy iStrategy;
	
	public Context(IStrategy _iStrategy){
		this.iStrategy=_iStrategy;
	}
	
	public void doAnything(){
		iStrategy.doSomething();
	}

}
