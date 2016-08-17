
public class InsertionSort {

	private static void insertionSort(int[] arr){
		
		for(int count = 1; count< arr.length; ++count){
			int i = count;
			while( i>0 && arr[i] < arr[i-1]){
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
				--i;
			}
		}
	}
}
