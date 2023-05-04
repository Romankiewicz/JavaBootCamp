package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void isNumberDividebleByThree_whenDividebleByThree_thanReturnStringFizz() {
		//given
		int number = 12;
		String expected = "Fizz";
		//when
		String result = FizzBuzz.whenDividebleByThree(number);
		//then
		assertEquals(expected, result);
	}
	
	@Test
	void isNumbernotDividebleByThree_whenNotDividebleByThree_thanReturnStringNumber() {
		//given
		int number = 11;
		String expected = "11";
		//when
		String result = FizzBuzz.whenDividebleByThree(number);
		//then
		assertEquals(expected, result);
	}
	
	@Test
	void isNumberDividebleByFive_whenDividebleByFive_thanReturnStringBuzz() {
		//given
		int number = 10;
		String expected = "Buzz";
		//when
		String result = FizzBuzz.whenDividebleByFive(number);
		//then
		assertEquals(expected, result);
	}
	
	@Test
	void isNumbernotDividebleByFive_whenNotDividebleByFive_thanReturnStringNumber() {
		//given
		int number = 11;
		String expected = "11";
		//when
		String result = FizzBuzz.whenDividebleByThree(number);
		//then
		assertEquals(expected, result);
	}
	
	@Test
	void isNumberDividebleByThreeAndFive_whenDividebleByThreeAndFive_thanReturnStringFizzBuzz() {
		//given
		int number = 15;
		String expected = "FizzBuzz";
		//when
		String result = FizzBuzz.whenDividebleByThreeAndFive(number);
		//then
		assertEquals(expected, result);
	}
	
	@Test
	void isNumberNotDividebleByThreeAndFive_whenNotDividebleByThreeAndFive_thanReturnStringNumber() {
		//given
		int number = 16;
		String expected = "16";
		//when
		String result = FizzBuzz.whenDividebleByThreeAndFive(number);
		//then
		assertEquals(expected, result);
	}
}
