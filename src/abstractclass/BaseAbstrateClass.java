package abstractclass;

public class BaseAbstrateClass {
	
	int i;

	public BaseAbstrateClass(){
		//System.out.println("BaseAbstrateClass constrate");
		System.out.println("Base-i:"+i);
		add(1);
		System.out.println("Base:"+i);
	}
	
	void add(int v){
		i+=v;
		System.out.println("Base-add:"+i);
	}
	
	public static void method1(){
		System.out.println("BaseAbstrateClass--method1");
	}
	
	//public abstract void method2();
}
