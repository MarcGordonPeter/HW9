package main;

public class FizzBuzz {

	public String convertNumber(int number) {
		// Implement
		String res = "";
		if (number % 5 == 0) {
			res += "Fizz";
		}
		if (number % 7 == 0) {
			res += "Buzz";
		}
		return res;
	}
}
