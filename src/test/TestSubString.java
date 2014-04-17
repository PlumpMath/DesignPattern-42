package test;

public class TestSubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String emailString="test1@163.com@server1";
		String Email=emailString.substring(0, emailString.lastIndexOf("@"));
		System.out.println(Email);
	}

}
