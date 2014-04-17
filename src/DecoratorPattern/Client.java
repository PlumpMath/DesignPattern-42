package DecoratorPattern;

public class Client {

	public static void main(String[] args){
		Component component=new ConcreateComponent();
		component=new ConcreteDecotator1(component);
		component=new ConcreteDecorator2(component);
		component.operate();
	}
}
