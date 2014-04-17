package callback;

public class Caller {

	private MyCallBack myCallBack;
	
	public void setCallBack(MyCallBack callBack){
		myCallBack=callBack;
	}
	
	public void call(){
		myCallBack.method();
	}
	
	
}
