package abstractclass;

public class NormalClass1 extends BaseAbstrateClass {

	public NormalClass1() {
		//System.out.println("NormalClass1 constrate");
		add(2);
	}
	
	void add(int v){
		i+=v*2;
		System.out.println("NormalClass1-add:"+i);
		
	}
	
	public static void method1(){
		System.out.println("NormalClass1--method1");
	}

	
	public void method2() {
		NormalClass1 normalClass1 = new NormalClass1();
		normalClass1.method1();
		BaseAbstrateClass bac=(BaseAbstrateClass)normalClass1;
		bac.method1();
		BaseAbstrateClass bac2=new NormalClass1();
		bac2.method1();
	}

}
