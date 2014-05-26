package JavaTest;

public class TestFinally {
	
	public static boolean testFinally(){
		int i=0;
		try {
			i=1;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean testfinally=TestFinally.testFinally();
		System.out.println("test:"+testfinally);
	}

}
