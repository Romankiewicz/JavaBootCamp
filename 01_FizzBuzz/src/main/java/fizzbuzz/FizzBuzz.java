package fizzbuzz;

public class FizzBuzz {

	public static String whenDividebleByThree(int number) {
		if(number % 3 == 0) {
			return "Fizz";
		}else {
			return String.valueOf(number);
		}
	}
//	public static void FizzBuzz() {
//	}

	public static String whenDividebleByFive(int number) {
		if(number % 5 == 0) {
			return "Buzz";
		}else {
			return String.valueOf(number);
		}
	}

	public static String whenDividebleByThreeAndFive(int number) {
		if(number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}else {
			return String.valueOf(number);
		}
	}
}
