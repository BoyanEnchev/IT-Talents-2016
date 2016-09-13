package homework;

public class Zad8 {

	public static void main(String[] args) {
		
		int a = 5534;
		int x = (a/1000)*10 + (a % 10);
		int y = (a % 1000) / 10;
		
		if(x > y){
			System.out.println("Bigger! (" + x + " > " + y +")");
		}
		else if(x<y){
			System.out.println("Lower! (" + x + " < " + y +")");
		}
		else{
			System.out.println("They are equals! (" + x + " = " + y +")");
		}
	}
}
