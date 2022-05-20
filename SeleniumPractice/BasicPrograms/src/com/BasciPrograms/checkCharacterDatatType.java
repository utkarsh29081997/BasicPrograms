package com.BasciPrograms;

public class checkCharacterDatatType {

	public static void main(String[] args) {
		
		String name =  "Utkarsh123";
		char []a = name.toCharArray();
		
		for (int i =0;i<=a.length-1;i++) {
			if(Character.isDigit(a[i])) {
				System.out.println("Digit found at position "+i+" is " +a[i]);
			}
		}

	}

}
