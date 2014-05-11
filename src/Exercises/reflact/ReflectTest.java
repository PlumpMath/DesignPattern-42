package Exercises.reflact;

import java.lang.reflect.Field;

//need another bean Point
public class ReflectTest {
	
	public static void main(String[] args) throws Exception {
		
		Point pt1 = new Point(3,5);
		
		//get all fields
		Field[] fields = pt1.getClass().getFields(); 
		
		for(Field field : fields ) {
			//��˵����String ���͵��ֶΣ���ȻҪѡ��һ��
			//if(field.getType().equals(String.class)) {
			//�ֽ��붼��һ�ݵģ���ʲô��equals��
			if(field.getType()== String.class) {
				String oldValue = (String)field.get(pt1);
				String newValue = oldValue.replace('b', 'a');
				//�� ������ֶ�
				field.set(pt1, newValue);
			}
		}
		
		System.out.println(pt1.s1);
		System.out.println(pt1.s2);
		System.out.println(pt1.s3);
		
		//aall
		//huain
		//zhangxiaoxiang

	}
}
