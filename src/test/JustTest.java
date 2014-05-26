package test;

public class JustTest {
	
	public static int getOneCount(int num){
		int number=0;
		String s=num+"";
		int len=s.length();
		if(len!=0){
			for(int i=0;i<len;i++){
				char a = s.charAt(i);
				if(a == '1'){
					number++;
				}
			}
		}
		return number;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int num=200010;
		int count=0;
		for(int i=num;i>=0;i--){
			count+=getOneCount(i);
		}
		System.out.println(count);*/
		String a="1.1.522";
		String bString="1.0.521";
		int c=a.compareTo(bString);
		System.out.println(c);
	}

}
