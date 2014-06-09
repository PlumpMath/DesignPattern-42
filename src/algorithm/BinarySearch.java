package algorithm;
/**
 * ¶ş·Ö²éÕÒ
 * @author Rodriguez-xin
 *
 */
public class BinarySearch {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("sss:"+binarySearch(a,a.length,7,0,a.length-1));
	}
	
	public static int binarySearch(int[] data,int length,int k,int start ,int end){
		int middleIndex=(start+end)/2;
		
		if(data[middleIndex]==k){
			if((middleIndex>0&&data[middleIndex-1]!=k)||middleIndex==0){
				return middleIndex;
			}else{
				end=middleIndex-1;
			}
		}else if(data[middleIndex]>k){
			end=middleIndex-1;
		}else{
			start=middleIndex+1;
		}
		
		return binarySearch(data, length, k, start, end);
	}

}
