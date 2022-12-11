package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.GregorianCalendar;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

public class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = { 1916, 1920, 1928, 1944, 1952 })
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calendar c = new Calendar(year);
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year)) {
			assertTrue(c.isLeapYear());
		} else {
			assertFalse(c.isLeapYear());
		}
	}

	@Test
	public void Is_below_1900() {
		Calendar c = new Calendar(1850);
		assertFalse(c.isLeapYear());
	}

	@Test
	public void Is_above_2000() {
		Calendar c = new Calendar(2002);
		assertFalse(c.isLeapYear());
	}

	@Test
	public void Is_not_modulo4() {
		Calendar c = new Calendar(1917);
		assertFalse(c.isLeapYear());
	}

	@Test
	public void Is_not_modulo100() {
		Calendar c = new Calendar(1917);
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(1917)) {
			assertTrue(c.isLeapYear());
		} else {
			assertFalse(c.isLeapYear());
		}
	}

	@Test
	@ValueSource(ints = { 1916, 1920, 1928, 1944, 1952 })
	public void Is_modulo_400() {
		Calendar c = new Calendar(2000);
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(2000)) {
			assertTrue(c.isLeapYear());
		} else {
			assertFalse(c.isLeapYear());
		}
	}

	// Implement test cases for the equivalent partitions

}
