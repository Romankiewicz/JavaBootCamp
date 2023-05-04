package smallerThanZero;

public class SmallerThanZero {
	
	public static boolean smallerThanZero(int number) {
		if(number < 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(smallerThanZero(2));
		
	}
}
