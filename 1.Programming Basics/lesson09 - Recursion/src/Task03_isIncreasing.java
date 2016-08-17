
public class Task03_isIncreasing {
	
	public static boolean isIncreasing(int[] arr, int index){
		if(index >= arr.length){
			return true;
		}
		if(arr[index] <= arr[index-1]){
			return false;
		}
		return isIncreasing(arr, index+1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(isIncreasing(arr,1));
	}

}
