package CommandPattern;

public class Invoker {

	private Command command;
	public void setCommand(Command _command){
		command=_command;
	}
	public void action(){
		command.execute();
	}
}
