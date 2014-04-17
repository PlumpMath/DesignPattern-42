package DecoratorPattern;

public class Decorator extends Component {
	
	private Component component;
	//通过构造函数传递被修饰者
	public Decorator(Component _component){
		this.component=_component;
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
