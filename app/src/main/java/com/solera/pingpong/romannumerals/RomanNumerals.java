package com.solera.pingpong.romannumerals;
import java.util.*;
public class RomanNumerals {
	private int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	public RomanNumerals() {
	}
	public String intToRoman(int arabicNumeral) {		
		StringBuilder romanNumeral = new StringBuilder();
		
		for (int i = 0; i< value.length && arabicNumeral > 0; i++) {
			while(arabicNumeral >= value[i]) {
				romanNumeral.append(roman[i]);
				arabicNumeral -= value[i];
			}
		}
		return romanNumeral.toString();
	}
	
	public int romanToInt(String romanNumeral) {
		Map<Character,Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
		int arabicNumeral =0;
        for(int i = 0; i < romanNumeral.length()-1; i++){
            if(map.get(romanNumeral.charAt(i)) < map.get(romanNumeral.charAt(i+1))) arabicNumeral -= map.get(romanNumeral.charAt(i));
            else arabicNumeral += map.get(romanNumeral.charAt(i));
        }
        return arabicNumeral  + map.get(romanNumeral.charAt(romanNumeral.length()-1));
	}
}
