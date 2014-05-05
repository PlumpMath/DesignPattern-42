package algorithm;

/**
 * 腾讯面试题，两个数组去重然后排序
 * 
 * @author Rodriguez-xin
 * 
 */
public class DelSameAndReorder {

	private int A[] = { 3, 4, 5, 6, 7 };
	private int B[] = { 1, 3, 5, 7, 9, 12, 13 };
	private int C[];

	public void delSameNumAndReorder() {
		int i = 0, j = 0,k = 0;
		C = new int[A.length + B.length];
		while (i < A.length && j < B.length) {
			if(A[i]>B[j]){
				C[k]=B[j];j++;k++;
			}else if(A[i]<B[j]){
				C[k]=A[i];i++;k++;
			}else{
				C[k]=A[i];i++;j++;k++;
			}
		}
		if(i==A.length){
			while(j<B.length){
				C[k]=B[j];j++;k++;
			}
		}else if(j==B.length){
			while(i<A.length){
				C[k]=A[i];i++;k++;
			}
		}
		
		for(int m=0;m<C.length;m++){
			System.out.print(C[m]+",");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DelSameAndReorder delSameAndReorder=new DelSameAndReorder();
		delSameAndReorder.delSameNumAndReorder();
		
	}

}
