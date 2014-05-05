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
		
		//字符串转char数组
		char mChar[] = str.toCharArray();
		//对对应的数组排序
		Arrays.sort(a);
		//将char数组转换成字符串
		String chatToString=Arrays.toString(mchar);
		//数组大小
		int int_length=a.length;
		//字符串长度
		int string_length=str.length();
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		System.out.println(str.charAt(1));
		
	}

}
