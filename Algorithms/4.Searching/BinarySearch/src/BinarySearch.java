
public class BinarySearch {

	private static int BinarySearch(int[] arr, int element){
		
		return Search(arr, element, 0, arr.length-1);
	}
	
	private static int Search(int[] arr, int element, int start, int end){
		int pivot = start + (end - start)/2;
		
		if(element == arr[pivot]) return pivot;
		if(pivot == start || pivot == end) return -1;
		
		if(element > arr[pivot]){
			return Search(arr, element, pivot + (start-pivot)/2, end);
		}
		else return Search(arr, element, start, pivot);
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 3 , 5, 6, 12, 25, 38, 51, 65, 101 };
		int elem1 = 12, elem2 = 65;
		
		System.out.println("Index of " + elem1 + " is: " + BinarySearch(arr, elem1));
		System.out.println("Index of " + elem2 + " is: " + BinarySearch(arr, elem2));

	}

}
