package CommandPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker=new Invoker();
		Receiver receiver=new ConcreteReciver1();
		Command command=new ConcreteCommand1(receiver);
		invoker.setCommand(command);
		invoker.action();
	}

}
