package SingletonPattern.simple;

public class Singleton {
	private static final Singleton SINGLETON=new Singleton();
	//���Ʋ����������
	private Singleton(){
		
	}
	//ͨ�����������ʵ������
	public static Singleton getSingleton() {
		return SINGLETON;
	}
	//������������
	public static void doSomething(){
		System.out.println("doSomething!");
	}
}
