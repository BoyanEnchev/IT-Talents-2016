
public class RecursieveMinMax {
	
	static int getMinMax(int[] arr, int index, int min, int max){
		if(index < 0 || index >= arr.length){
			return max-min;
		}
		if(arr[index] < min) min = arr[index];
		if(arr[index] > max) max = arr[index];
		
		return getMinMax(arr, index+1, min, max);
	}
	
	public static void main(String[] args) {
		
		int[] array = {2, 5, 1, 8, 6, 10, 3};
		
		System.out.println(getMinMax(array, 0, array[0], array[0]));   //9
	}

}
