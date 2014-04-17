package callback;

public class Called{
	
	public static MyCallBack myCallBack=new MyCallBack() {
		@Override
		public void method() {
			System.out.println("nihaoa");
		}
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller caller=new Caller();
		caller.setCallBack(myCallBack);
		caller.call();
	}
}
