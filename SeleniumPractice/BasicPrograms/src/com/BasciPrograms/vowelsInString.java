package com.BasciPrograms;

import java.util.HashMap;
import java.util.Map;

/*
interface abc1{
	public static void abcd() {
		System.out.println("Hello");
	}
}
*/
public class vowelsInString /*implements abc1 */{

	public static void main(String[] args) {
		String s = "Utkarsh Welcomeiii";
		String s1 = s.toLowerCase();
		char a[] = s1.toCharArray();
//		abc1.abcd();
		
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i <= a.length - 1; i++) {
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i]) + 1);
			}
			else {
				hm.put(a[i], 1);
			}
		}

		for (Map.Entry m : hm.entrySet()) {
			char letter = (char) m.getKey();
			int count = (int) m.getValue();
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				
				System.out.println("The vowel '"+letter+"' Appeared "+ count+" times");
				
			}
		}

	}

}
