package algorithm.base;

import java.util.Arrays;

public class JavaStringToChat {
	
	public static String str="hello world!";
	
	public static char mchar[]={'a','s','d','f'};
	
	public static int a[]={1,6,5,4,8,16,9,10};
	
	public JavaStringToChat(){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaStringToChat javaStringToChat=new JavaStringToChat();
		
		//�ַ���תchar����
		char mChar[] = str.toCharArray();
		//�Զ�Ӧ����������
		Arrays.sort(a);
		//��char����ת�����ַ���
		String chatToString=Arrays.toString(mchar);
		//�����С
		int int_length=a.length;
		//�ַ�������
		int string_length=str.length();
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		System.out.println(str.charAt(1));
		
	}

}
