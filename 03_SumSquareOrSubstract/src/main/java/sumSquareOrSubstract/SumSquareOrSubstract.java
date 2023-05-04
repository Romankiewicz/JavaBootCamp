package sumSquareOrSubstract;

public class SumSquareOrSubstract {
	
	public static int sumSquareOrSubstract(int a, int b, boolean c) {
		if(c) {
			return (a - b);
		}else if(a > b) {
			return (b + a);
		}else {
			return (a * b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sumSquareOrSubstract(1, 2, true));
	}
}
