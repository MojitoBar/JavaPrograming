package hw11_1;

public class MyIntegerSort {
	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length-1);
	}
	public static void mergeSort(int[] array, int lb, int ub) {
		int middle = 0;
		if(lb < ub) {
			middle = (lb + ub) / 2;
			mergeSort(array, lb, middle);
			mergeSort(array, middle + 1, ub);
			merge(array, lb, middle, ub);
		}
	}
	public static void merge(int[] array, int lb, int middle, int ub) {
		int i = lb;
		int j = middle + 1;
		int k = lb;
		int temp[] = new int[array.length];
		
		while(i <= middle && j <= ub) {
			if(array[i] <= array[j]) {
				temp[k] = array[i++];
			}
			else {
				temp[k] = array[j++];
			}
			k++;
		}
		
		if (i > middle) {
			for (int t = j; t <= ub; t++, k++) {
				temp[k] = array[t];
			}
		}
		else {
			for (int t = i; t <= middle; t++, k++) {
				temp[k] = array[t];
			}
		}
		
		for(int index = lb; index <= ub; index++) {
			array[index] = temp[index];
		}
	}
}
