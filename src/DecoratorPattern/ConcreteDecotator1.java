package DecoratorPattern;

public class ConcreteDecotator1 extends Decorator {

	public ConcreteDecotator1(Component _component) {
		super(_component);
		// TODO Auto-generated constructor stub
	}
	//�����Լ������η���
	public void method1(){
		System.out.println("method1 ����");
	}
	//
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.method1();
		super.operate();
	}
	

}
