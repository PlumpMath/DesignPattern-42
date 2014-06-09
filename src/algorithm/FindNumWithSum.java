package algorithm;
/**
 * ������������飬��һ�����֣��������в������������������ڸ���������
 * @author Rodriguez-xin
 *
 */
public class FindNumWithSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data={2,4,5,7,8,10,14,16};
		findNumWithSum(data, data.length, 15);
	}
	
	public static void findNumWithSum(int[] data,int length,int sum){
		int start=0;
		int end=length-1;
		
		while(start<end){
			int temp=data[start]+data[end];
			if(temp==sum){
				System.out.println("start:"+start+"--end:"+end);
				break;
			}else if(temp>sum){
				end--;
			}else{
				start++;
			}
		}
	}
}
