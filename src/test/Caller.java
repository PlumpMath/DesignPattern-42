package test;

public class Caller {

	public static CallBackInterface callback;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Called called=new Called();
		called.setcall(callback=new CallBackInterface() {
			
			@Override
			public void success() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void failed() {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
