package Factorypattern;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ����Ƥ���Ǻ�ɫ�ģ�");
	}

	@Override
	public void talk() {
		System.out.println("����˵��һ������������");
	}

}
