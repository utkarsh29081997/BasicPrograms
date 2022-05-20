package com.BasciPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccuranceInString {

	public static void OccuranceCount(String inputStr) {

		HashMap<Character, Integer> map = new HashMap<>();
		char a[] = inputStr.toCharArray();

		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry m : map.entrySet()) {
			char letter = (char) m.getKey();
			int count = (int) m.getValue();

			if (count > 1) {
				System.out.println("The letter '" + letter + "' is repeated " + count + " times");
			}
		}
	}

	public static void main(String[] args) {

		String Str = "This house is is mine I won this house this In these games and these GaMes are best is it"
				.toLowerCase();

		OccuranceCount(Str);

	}

}
