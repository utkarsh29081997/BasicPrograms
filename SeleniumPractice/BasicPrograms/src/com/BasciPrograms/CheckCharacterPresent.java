package com.BasciPrograms;

public class CheckCharacterPresent {

	public static void main(String[] args) {
		String name = "UtkarshSingh";
		boolean res = name.contains("ar");
		char a[] = name.toCharArray();
		char b = 'a';
		
		for(char c:a) {
			if(c==b) {
				System.out.println("Character '"+c+"' does exist");
			}
		}
		
		System.out.println(res);
		
	}

}
