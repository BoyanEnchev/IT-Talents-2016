
public class Task13 {

	public static int[] unionArrays(int[] arr1, int[] arr2) {
		
		int[] union = new int[arr1.length + arr2.length];
		
		for (int index = 0; index < arr1.length; index++) {
			union[index] = arr1[index];
		}
		int unionIndex = arr1.length;
		for (int index = 0; index < arr2.length; index++) {
			union[unionIndex] = arr2[index];
			unionIndex++;
		}
		return union;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int[] unionArr = unionArrays(arr1,arr2);
		
		for (int index = 0; index < unionArr.length; index++) {
			System.out.print(unionArr[index] + " ");
		}
	}

}
