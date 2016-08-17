
public class MergeSort {
	
	

	private static void MergeSort(int[] arr, int start, int end){
		
		if(start == end) return;
		
		int mid = start +   (end-start)/2;
		
		MergeSort(arr, start, mid);
		MergeSort(arr, mid+1, end);
		
		Merge(arr, start, end);
	}
	
	private static void Merge(int[] arr, int start, int end){
		int[] tempArr = new int[end-start+1];
		int left = start;
		int mid = start + (end-start)/2;
		int right = mid+1;
		int result = 0;
		
		while(left <= mid && right<= end){
			if(arr[left] > arr[right]){
				tempArr[result] = arr[right];
				right++;
			}
			else{
				tempArr[result] = arr[left];
				left++;
			}
			
			result++;	
		}
		
		while(left <= mid){
			tempArr[result] = arr[left];
			left++;
			result++;
		}
		
		while(right <= end){
			tempArr[result] = arr[right];
			right++;
			result++;
		}
		
		int counter = 0;
		for(int i = start; i < start + tempArr.length; ++i){
			arr[i] = tempArr[counter];
			counter++;
		}
	}
	
	private static void print(int[] arr){
		for(int i=0; i< arr.length; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

		int[] arr = {8, 5, 7, 1, 23, 5, 3, 6};
		
		print(arr);
		MergeSort(arr,0,7);
		print(arr);
	}

}