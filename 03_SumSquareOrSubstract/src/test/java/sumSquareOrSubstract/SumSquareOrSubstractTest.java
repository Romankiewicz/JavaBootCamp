package sumSquareOrSubstract;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSquareOrSubstractTest {

	@Test
	void isFirstNumberLargerThanSecondNumber_whenBooleanIsFalse_thanReturnSum() {
		int a = 5;
		int b = 2;
		boolean c = false;
		
		int expected = a + b;
		
		int result = SumSquareOrSubstract.sumSquareOrSubstract(a, b, c);
		
		assertEquals(expected, result);
	}

	@Test
	void isFirstNumberSmallerThanSecondNumber_whenBooleanIsFalse_thanReturnSqr() {
		int a = 1;
		int b = 2;
		boolean c = false;
		
		int expected = a * b;
		
		int result = SumSquareOrSubstract.sumSquareOrSubstract(a, b, c);
		
		assertEquals(expected, result);
	}
	
	@Test
	void isFirstNumberLargerThanSecondNumber_whenBooleanIsTrue_thanReturnDiff() {
		int a = 5;
		int b = 2;
		boolean c = true;
		
		int expected = a - b;
		
		int result = SumSquareOrSubstract.sumSquareOrSubstract(a, b, c);
		
		assertEquals(expected, result);
	}
	
	@Test
	void isFirstNumberSmallerThanSecondNumber_whenBooleanIsTrue_thanReturnDiff() {
		int a = 1;
		int b = 2;
		boolean c = true;
		
		int expected = a - b;
		
		int result = SumSquareOrSubstract.sumSquareOrSubstract(a, b, c);
		
		assertEquals(expected, result);
	}
}
