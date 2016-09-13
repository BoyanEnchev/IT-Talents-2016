
public class SearchInArray {

	public static boolean compareArrays(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean searchInArray(int[][][] bigArr, int[] arr, 
										int depth, int row, int col, boolean flag){
		if(flag){
			return true;
		}
		if(depth >= bigArr.length){
			return false;
		}
		
		if(row >= bigArr[depth].length){
			return searchInArray(bigArr, arr, depth+1, 0, 0, flag);
		}
		if(col >= bigArr[depth][row].length){
			return searchInArray(bigArr, arr, depth, row+1, 0, flag);
		}
		
		if(compareArrays(bigArr[depth][row], arr)){
			flag = true;
			return flag;
		}
		return searchInArray(bigArr, arr, depth, row, col+1, flag);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {26,27,28};
		int[][][] bigArray = { 		{{1,2,3}, {4,5,6}, {7,8,9}},
								{{11,12,13}, {14,15,16}, {17,18,19}},
								{{20,21,22}, {23,24,25}, {26,27,28}},
								{{29,30,31}, {32,33,34}, {35,36,37}} };
		
		System.out.println(searchInArray(bigArray, arr, 0, 0, 0, false));
		}
	}


