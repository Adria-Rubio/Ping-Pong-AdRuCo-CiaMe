package com.solera.pingpong.romannumerals;

public class RomanNumerals {
	int arabicNumeral;
	public RomanNumerals(int number) {
		arabicNumeral = number;
	}
	public String intToRoman() {
		int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder romanNumeral = new StringBuilder();
		
		for (int i = 0; i< value.length && arabicNumeral > 0; i++) {
			while(arabicNumeral >= value[i]) {
				romanNumeral.append(roman[i]);
				arabicNumeral -= value[i];
			}
		}
		return romanNumeral.toString();
	}
}
