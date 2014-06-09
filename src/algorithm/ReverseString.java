package algorithm;
/**
 * ÄæÐò×Ö·û´®
 * @author Rodriguez-xin
 *
 */
public class ReverseString {

	public static String str1="hello world";
	
	public String reverseStr(String str,int start,int end){
		char temp;
		char charStr[]=str.toCharArray();
		while(start<end){
			temp=charStr[start];
			charStr[start]=charStr[end];
			charStr[end]=temp;
			start++;
			end--;
		}
		return String.valueOf(charStr);//Arrays.toString(charStr);
	}
	
	public String reverseWord(String str){
		String words[]=str.split(" ");
		String reverseWord = "";
		for(int i=0;i<words.length;i++){
			words[i]=reverseStr(words[i], 0, words[i].length()-1);
			reverseWord+=words[i]+" ";
		}
		return reverseWord;
	}
	
	public static void main(String args[]) {
		ReverseString reverseString=new ReverseString();
		String str2=reverseString.reverseStr(str1, 0, str1.length()-1);
		System.out.println(reverseString.reverseWord(str2));
	}
}
