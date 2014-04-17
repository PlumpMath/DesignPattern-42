package test;

public class Called {
	public static CallBackInterface callBackInterface;
	public void setcall(CallBackInterface interface1){
		callBackInterface=interface1;
	}
	public void call(){
		callBackInterface.success();
	}
}
