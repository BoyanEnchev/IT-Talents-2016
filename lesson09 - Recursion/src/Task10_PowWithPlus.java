
public class Task10_PowWithPlus {

	public static int product(int mult1, int mult2){
		if(mult1 <= 1){
			return mult2;
		}
		else{
			return mult2 + product(mult1-1, mult2);
		}
	}
	
	public static int powWithPlus(int x, int constX, int y){
		if(y==0) return 1;
		if(y==1) return x;
		if(y==2){
			return product(x,constX);
		}
		else{
			return powWithPlus(product(x,constX), constX, y-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(powWithPlus(2,2,4));
	}

}
