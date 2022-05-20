package com.BasciPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateValuesinString {

	public static void main(String[] args) {
		String a = "abbbc";
		char b[] = a.toCharArray();

		Set s = new LinkedHashSet<>();
		for(int i=0;i<=b.length-1;i++) {
		s.add(b[i]);
		}

		Iterator<Character> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
	}

}
