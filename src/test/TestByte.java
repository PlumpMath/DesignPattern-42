package test;

public class TestByte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] modeData={0x25,0x1,0x0,0x0,0x1,0x0,0x0,0x27};
		byte[] modeData2=new byte[8];
		String string1 = "m";
		for(int i=0;i<modeData.length;i++){
		string1+=":"+modeData[i];
		}
		System.out.println("sendToyMode---"+string1);
		String[] cmddata=string1.split(":");
		if(cmddata[0].equals("m")){
		for(int i=1;i<cmddata.length;i++){
			modeData2[i-1] = (byte) Integer.parseInt(cmddata[i]);

			System.out.println(modeData[i-1]);
			System.out.println(modeData2[i-1]);
		}
		}
	}

}
