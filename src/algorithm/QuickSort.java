package algorithm;

import javax.xml.crypto.Data;

public class QuickSort {

	private int[] data = { 3, 5, 16, 8, 25, 4, 26, 15, 18, 45, 24, 56, 27, 28,
			9, 65 };

	public void quickSort(int start, int end) {
		if(start<end){
			int base = data[start];
			int temp;
			int i=start,j=end;
			while(i<=j){
				while(data[i]<base){
					i++;
				}
				while(data[j]>base){
					j--;
				}
				if(i<=j){
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
					i++;j--;
				}
			}
			if(start<j){
				quickSort(start,j);
			}
			if(end>i){
				quickSort(i,end);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort quickSort1=new QuickSort();
		quickSort1.quickSort(0, quickSort1.data.length-1);
		
		for(int i=0;i<quickSort1.data.length;i++){
			System.out.println(quickSort1.data[i]);
		}
	}

}
