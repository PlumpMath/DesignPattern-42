package SingletonPattern.extension;

import SingletonPattern.simple.Singleton;

public class Minister {

	public static void main(String[] args){
		int ministerNum=5;
		for(int i=0;i<ministerNum;i++){
			Emperor emperor=Emperor.getInstance();
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor.say();
		}
	}
}
