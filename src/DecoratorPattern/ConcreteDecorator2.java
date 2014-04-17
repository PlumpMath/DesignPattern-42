package DecoratorPattern;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component _component) {
		super(_component);
		// TODO Auto-generated constructor stub
	}
	public void method2(){
		System.out.println("method2 –ﬁ Œ");
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.method2();
		super.operate();
	}
	
}
