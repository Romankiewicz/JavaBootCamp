package smallerThanZero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallerThanZeroTest {

	@Test
	void isNumberSmallerThanZero_whenSmallerThanZero_thenReturnTrue() {
		int number = 1;
		boolean expected = true;
		
		boolean result = SmallerThanZero.smallerThanZero(number);
		assertEquals(expected, result);
	}
	
	@Test
	void isNumberSmallerThanZero_whenBiggerThanZero_thenReturnFalse() {
		int number = 0;
		boolean expected = false;
		
		boolean result = SmallerThanZero.smallerThanZero(number);
		assertEquals(expected, result);
	}
	

}
