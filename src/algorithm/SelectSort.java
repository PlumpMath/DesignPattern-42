package algorithm;
/**
 * —°‘Ò≈≈–Ú
 * @author Rodriguez-xin
 *
 */
public class SelectSort {

	public static int[] selectSort(int[] data) {
		int temp;
		temp = data[0];
		for (int i = 0; i < data.length; i++) {
			int j = i;
			while (j < data.length) {
				if (data[i] > data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
				j++;
			}
		}
		return data;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int data[] = { 12, 6, 4, 67, 7, 5, 56, 8, 3, 17, 13, 15, 27, 35 };
		int[] sortData=SelectSort.selectSort(data);
		
		for (int i = 0; i < sortData.length; i++) {
			int j = sortData[i];
			System.out.print(j+",");
		}
	}

}
