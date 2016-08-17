package Main;

import java.util.Arrays;

public class VariationNoRepetions_2 {
	
	public static void Genenarate(int[] arr, int sizeOfSet, int index){
		
	
				
		if ( index >= arr.length) System.out.println(Arrays.toString(arr));
		else{
			for(int i=1; i<sizeOfSet; ++i){
					
				arr[index] = i;
					
				Genenarate(arr, sizeOfSet, index+1);
				
			}
		}		
	}
}