package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import calculator.SimpleCalculator;

public class SimpleCalculatorTest {

	@Test
	public void twoPlusTwoShouldEqualFour() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void fiftyNineShouldReturnF() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals('F', calculator.determineLetterGrade(59));
	}

	@Test
	public void fiftyNineShouldReturnD() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals('D', calculator.determineLetterGrade(69));
	}

	@Test
	public void fiftyNineShouldReturnC() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals('C', calculator.determineLetterGrade(79));
	}

	@Test
	public void fiftyNineShouldReturnB() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals('B', calculator.determineLetterGrade(99));
	}

	@Test
	public void numberNegativeReturnIllegalArgumentException() {
		SimpleCalculator calculator = new SimpleCalculator();
		assertThrows(IllegalArgumentException.class,
						() -> {
							calculator.determineLetterGrade(-1);
						});
	}

}
