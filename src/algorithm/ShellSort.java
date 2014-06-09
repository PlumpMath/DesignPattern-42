package algorithm;

public class ShellSort {

	public static int a[] = { 21, 24, 16, 33, 17, 23, 78, 3, 34, 83, 56, 7, 4,
			6 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		shellSort(a.length - 1);
	}

	public static void shellSort(int index) {
		int i, j, k;
		int temp;
		boolean change;
		int pointer;
		int dataLength = index / 2;

		while (dataLength != 0) {
			for (j = dataLength; j < index; j++) {
				change = false;
				temp = a[j];
				pointer = j - dataLength;

				while (temp < a[pointer] && pointer >= 0 && pointer <= index) {
					a[pointer + dataLength] = a[pointer];
					pointer = pointer - dataLength;
					change = true;
					if(pointer<0||pointer>index)
						break;
				}
				a[pointer + dataLength] = temp;
				if (change) {
					for (k = 0; k < index; k++) {
						System.out.print(a[k] + ",");
					}
					System.out.println();
				}
				dataLength = dataLength / 2;
			}
		}

	}

}
