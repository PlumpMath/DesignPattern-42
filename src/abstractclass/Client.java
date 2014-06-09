package abstractclass;

public class Client {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*NormalClass1 normalClass1=new NormalClass1();
		normalClass1.method2();*/
		go(new NormalClass1());

	}
	
	static void go(BaseAbstrateClass b){
		b.add(8);
	}

}
