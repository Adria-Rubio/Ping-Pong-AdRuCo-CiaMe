package com.solera.pingpong.fizzbuzz;

public class FizzBuzz {
	int fizzBuzzNumber;
	public FizzBuzz(int number) {
		fizzBuzzNumber = number;
	}

	public String calcFizzBuzz() {
		String output = "";
		if(fizzBuzzNumber % 3 == 0) {
			output+="Fizz";
		}
		if(fizzBuzzNumber % 5 == 0) {
			output+="Buzz";
		}
		if(fizzBuzzNumber % 7 == 0) {
			output+="Pop";
		}
		if(output.length() == 0) {
			output = String.valueOf(fizzBuzzNumber);
		}
		return output;
	}
}
