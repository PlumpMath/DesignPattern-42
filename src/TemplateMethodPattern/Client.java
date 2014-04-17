package TemplateMethodPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass class1=new ConcreteClass1();
		
		class1.templateMethod();
	}

}
