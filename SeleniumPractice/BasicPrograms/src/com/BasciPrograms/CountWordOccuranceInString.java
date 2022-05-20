package com.BasciPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccuranceInString {

	public static void main(String[] args) {

		String sentence = "This house is is mine,I won this house this,In these games and these GaMes are best is it 123 123, ";
		String regex_sentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");
	//	System.out.println(regex_sentence);
		String l_sentence=regex_sentence.toLowerCase();
		String s[] = l_sentence.split(" ");
		System.out.println(l_sentence);
		int count = 1;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i <= s.length - 1; i++) {
			if (map.containsKey(s[i])) {
				// System.out.println(map.get(s[i])+" Here word");
				map.put(s[i],map.get(s[i])+1);
			}
			else {
				map.put(s[i], count);
			}
		}
		
		for(Map.Entry m : map.entrySet()) {
			String word = (String)m.getKey();
			int word_count = (int)m.getValue();
			
			if (word_count>1) {
				System.out.println("The word '"+word+"' is repeated "+word_count+" times");
			}
			
		}
	}

}
