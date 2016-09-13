
public class Task09_ProductOnlyWithPlus {

	public static int productWithPlus(int mult1, int mult2){
		
		if(mult1 == 0 || mult2 ==0){
			return 0;
		}
		if(mult1 == 1){
			return mult2;
		}
		if(mult1 == -1){
			return -mult2;
		}
		
		if(mult1 > 0){
			return mult2 + productWithPlus(mult1-1, mult2);
		}
		else{
			return productWithPlus(mult1+1, mult2) - mult2;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(productWithPlus(-5,-8));
		
		System.out.println((int)Math.pow(0, 0));
	}

}
