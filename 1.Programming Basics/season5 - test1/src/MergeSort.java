
public class MergeSort {

	public static void mergeSort(int[] arr, int lower, int higher) {
		if (lower == higher) {
			return;
		}
		int mid = (lower + higher) / 2;

		mergeSort(arr, lower, mid);
		mergeSort(arr, mid + 1, higher);

		merge(arr, lower, higher);
	}
	

	public static void merge(int[] arr, int start, int end) {
		int[] tempArr = new int[end - start + 1];
		int left = start;
		int mid = (start + end) / 2;
		int right = mid + 1;
		int result = 0;

		while (left <= mid && right <= end) {
			if (arr[left] > arr[right]) {
				tempArr[result] = arr[right];
				right++;
			} else {
				tempArr[result] = arr[left];
				left++;
			}
			result++;
		}
		while (left <= mid) {
			tempArr[result] = arr[left];
			left++;
			result++;
		}
		while (right <= end) {
			tempArr[result] = arr[right];
			right++;
			result++;
		}
		int counter = 0;
		for (int i = start; i < start + tempArr.length; i++) {
			arr[i] = tempArr[counter];
			counter++;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 5, 2, 15, 7, -1, 2, 1 };
		

		mergeSort(arr, 0, arr.length - 1);

	
			System.out.print(arr[arr.length-1] - arr[0]);
		
	}

}
