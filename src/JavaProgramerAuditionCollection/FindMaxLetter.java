package JavaProgramerAuditionCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class FindMaxLetter {

	public static void main(String[] args) {
		String input = "aavzcadfdsfsdhssdfjwfasda";
		new FindMaxLetter().doString(input);
	}

	public void doString(String input) {
		char[] chars = input.toCharArray();
		ArrayList<String> lists = new ArrayList<String>();
		TreeSet<String> set = new TreeSet<String>();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println("set:" + set);
		Collections.sort(lists);
		System.out.println("lists:" + lists);
		StringBuffer sbBuffer = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sbBuffer.append(lists.get(i));
		}
		input = sbBuffer.toString();
		System.out.println("input:" + input);
		int max = 0;
		String maxString = "";
		ArrayList<String> maxlist = new ArrayList<String>();
		Iterator<String> its = set.iterator();
		while (its.hasNext()) {
			String string = (String) its.next();
			int begin = input.indexOf(string);
			int end = input.lastIndexOf(string);
			int value = end - begin + 1;
			if(value>max){
				max = value;
				maxString = string;
				maxlist.add(string);
			}else if(value == max){
				maxlist.add(string);
			}
		}
	}
}
