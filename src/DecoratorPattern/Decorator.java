package DecoratorPattern;

public class Decorator extends Component {
	
	private Component component;
	//ͨ�����캯�����ݱ�������
	public Decorator(Component _component){
		this.component=_component;
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
