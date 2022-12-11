package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2 + 3;
		int actualresult = calculator.add(2, 3);

		assertEquals(expectedResult, actualresult);
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 9 - 2;
		int actualresult = calculator.sub(9, 2);

		assertEquals(expectedResult, actualresult);
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 12 * 99;
		int actualresult = calculator.multiply(12, 99);

		assertEquals(expectedResult, actualresult);
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		int expectedResult = 81 / 3;
		int actualresult = (int) calculator.divide(81, 3);

		assertEquals(expectedResult, actualresult);
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {

		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(3, 0);
		});
	}
}
